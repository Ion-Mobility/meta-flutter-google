#
# Copyright (c) 2020-2024 Joel Winarske. All rights reserved.
#

SUMMARY = "sensors_plus_example"
DESCRIPTION = "Demonstrates how to use the sensors plugin."
AUTHOR = "Flutter Community"
HOMEPAGE = "None"
BUGTRACKER = "None"
SECTION = "graphics"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=aaa4daf7a83c6896af2c007b59db56e4"

SRCREV = "05f8afb8fc43bc702ab5e3e14e3cba9d79983446"
SRC_URI = "git://github.com/fluttercommunity/plus_plugins.git;lfs=1;nobranch=1;protocol=https;destsuffix=git"

S = "${WORKDIR}/git"

PUB_CACHE_EXTRA_ARCHIVE_PATH = "${WORKDIR}/pub_cache/bin"
PUB_CACHE_EXTRA_ARCHIVE_CMD = "flutter pub global activate melos; \
    melos bootstrap"

PUBSPEC_APPNAME = "sensors_plus_example"
FLUTTER_APPLICATION_INSTALL_SUFFIX = "fluttercommunity-plus-plugins-packages-sensors-plus-sensors-plus-example"
FLUTTER_APPLICATION_PATH = "packages/sensors_plus/sensors_plus/example"

inherit flutter-app
