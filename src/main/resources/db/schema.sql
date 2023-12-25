CREATE TABLE `tb_user`
(
    `id`       int NOT NULL,
    `username` varchar(255) DEFAULT NULL,
    `password` varchar(255) DEFAULT NULL,
    `age`      int          DEFAULT NULL,
    PRIMARY KEY (`id`)
);
