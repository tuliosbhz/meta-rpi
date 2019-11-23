SUMMARY = "A console development image customized for the rpi"
HOMEPAGE = "http://www.jumpnowtek.com"

require images/console-image.bb

DEPENDS += "bcm2835-bootfiles"

WIFI = " \
    crda \
    iw \
    linux-firmware-rpidistro-bcm43430 \
    linux-firmware-rpidistro-bcm43455 \
    wpa-supplicant \
"

DEV_EXTRAS = " \
    serialecho  \
    spiloop \
"

RPI_STUFF = " \
    omxplayer \
    raspi2fb \
    userland \
"

IMAGE_INSTALL += " \
    ${DEV_EXTRAS} \
    ${RPI_STUFF} \
    ${WIFI} \
"


export IMAGE_BASENAME = "rpi-console-image"
