CREATE TABLE IF NOT EXISTS admin(
	userId VARCAHR(5) NOT NULL,
	nama VARCHAR(20),
	no_telp VARCHAR(20),
	gender VARCHAR(10),
);

CREATE TABLE IF NOT EXISTS pengirim(
        userId VARCAHR(5) NOT NULL,
        nama VARCHAR(20),
        no_telp VARCHAR(20),
        gender VARCHAR(10),
);

CREATE TABLE IF NOT EXISTS kurir(
        userId VARCAHR(5) NOT NULL,
        nama VARCHAR(20),
        no_telp VARCHAR(20),
        gender VARCHAR(10),
	tipe_kendaraan(10)
);


CREATE TABLE IF NOT EXISTS barang(
	id_barang INT NOT NULL AUTO_INCREMENT,
	nama_barang VARCHAR(100) NOT NULL,
	berat_barang INT,
	kuantitas_barang INT,
	harga_barang double,
	tipe_barang VARCHAR(50),
	PRIMARY KEY(id_barang)
);
