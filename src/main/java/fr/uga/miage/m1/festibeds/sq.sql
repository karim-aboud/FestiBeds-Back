USE `festibeds`;

DELIMITER $ $ CREATE TRIGGER `reservation_tbl_BINS` BEFORE
INSERT
    ON reservation_tbl FOR EACH ROW -- Edit trigger body code below this line. Do not edit lines above this one
SET
    @val = EXISTS (
        SELECT
            NULL
        FROM
            `reservation_tbl` AS existing
        WHERE
            NEW.room_idx = existing.room_idx
            AND (
                (
                    new.start_datetime <= existing.start_datetime
                    AND existing.start_datetime < new.end_datetime
                )
                OR (
                    new.start_datetime < existing.end_datetime
                    AND existing.end_datetime <= new.end_datetime
                )
                OR (
                    existing.start_datetime <= new.start_datetime
                    AND new.start_datetime < end_datetime
                )
                OR (
                    existing.start_datetime < new.end_datetime
                    AND new.end_datetime <= end_datetime
                )
            ) 
            IF (@val) THEN signal SQLSTATE '45000'; END IF;
);