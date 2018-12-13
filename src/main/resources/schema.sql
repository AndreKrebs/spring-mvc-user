CREATE SCHEMA `user_mvc` DEFAULT CHARACTER SET utf8 ;

CREATE TABLE `user_mvc`.`user` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `is_enabled` TINYINT NOT NULL DEFAULT 1,
  `register_date` DATE NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `surname` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `phone` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC));

INSERT INTO `user_mvc`.`user` (`username`, `password`, `is_enabled`, `register_date`, `name`, `surname`, `email`, `phone`) VALUES ('andre.krebs', '12345', '1', '2018-12-12', 'André', 'Silva', 'andre.krebssilva@gmail.com', '41-3423-5455');
INSERT INTO `user_mvc`.`user` (`username`, `password`, `is_enabled`, `register_date`, `name`, `surname`, `email`, `phone`) VALUES ('suzana.prestes', '12345', '1', '2018-10-12', 'Suzana', 'Prestes', 'suh208@gmail.com', '41-4444-5455');
  