# Copyright 2020-2021 NXP

DESCRIPTION = "Kernel loadable module for ISP"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://${S}/../LICENSE;md5=64381a6ea83b48c39fe524c85f65fb44"

SRC_URI = "git://${BSPDIR}/local-repos/isp-vvcam;protocol=file;branch=tokay-pro-lf-5.15.y_2.1.0"
SRCBRANCH = "tokay-pro-lf-5.15.y_2.1.0"
SRCREV = "${AUTOREV}"
PV = "${SRCBRANCH}"

S = "${WORKDIR}/git/vvcam/v4l2"
DEBUG_PREFIX_MAP = "-fmacro-prefix-map=${WORKDIR}/git/vvcam=/usr/src/debug/${PN}/${EXTENDPE}${PV}-${PR} \
 -fdebug-prefix-map=${WORKDIR}/git/vvcam=/usr/src/debug/${PN}/${EXTENDPE}${PV}-${PR} \
 -fmacro-prefix-map=${B}=/usr/src/debug/${PN}/${EXTENDPE}${PV}-${PR} \
 -fdebug-prefix-map=${B}=/usr/src/debug/${PN}/${EXTENDPE}${PV}-${PR} \
 -fdebug-prefix-map=${STAGING_DIR_HOST}= \
 -fmacro-prefix-map=${STAGING_DIR_HOST}= \
 -fdebug-prefix-map=${STAGING_DIR_NATIVE}= \
"

inherit module

COMPATIBLE_MACHINE = "(mx8mp-nxp-bsp)"
