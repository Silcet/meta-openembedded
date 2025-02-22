SUMMARY = "A high-level Python efficient arrays of booleans -- C extension"
HOMEPAGE = "https://github.com/ilanschnell/bitarray"
LICENSE = "PSF"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=2ad702cdcd49e8d2ac01d7e7d0810d2d"

SRC_URI[sha256sum] = "ee13850d3237c254c7af8acce2f1a044a1c4f22dcec5380cba7443c8be38f701"

inherit setuptools3 pypi

BBCLASSEXTEND = "native nativesdk"
