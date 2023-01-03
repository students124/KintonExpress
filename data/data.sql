CREATE TABLE IF NOT EXISTS user(
	userId INT NOT NULL AUTO_INCREMENT,
	nama VARCHAR(80),
	gender INT,
	userType INT,
	PRIMARY KEY (userId)
);

CREATE TABLE IF NOT EXISTS barang(
	id_barang INT NOT NULL AUTO_INCREMENT,
	nama_barang VARCHAR(100) NOT NULL,
	berat_barang INT,
	kuantitas_barang INT,
	harga_barang INT,
	tipe_barang VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS kurir_antar(
	userId INT NOT NULL,
	tipe_kendaraan VARCHAR(50),
	FOREIGN KEY (userId) REFERENCES user(userId)
);

CREATE TABLE IF NOT EXISTS pengirim(
	userId INT NOT NULL,
	id_barang INT NOT NULL,
	FOREIGN KEY (userId) REFERENCES user(userId),
	FOREIGN KEY (id_barang) REFERENCES barang(id_barang)
);

--CREATE TABLE IF NOT EXISTS pengiriman();
