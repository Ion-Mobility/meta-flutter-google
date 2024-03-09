#
# Copyright (c) 2020-2024 Joel Winarske. All rights reserved.
#

SUMMARY = "testing_app"
DESCRIPTION = "A sample that shows testing in Flutter."
AUTHOR = "Google"
HOMEPAGE = "None"
BUGTRACKER = "None"
SECTION = "graphics"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b7eeb61b41ae366e94383bca5e113fce"

SRCREV = "4def035e4c643fdfc44edc14fcc1bd1271663915"
SRC_URI = "git://github.com/flutter/samples.git;lfs=1;nobranch=1;protocol=https;destsuffix=git"

S = "${WORKDIR}/git"

PUBSPEC_APPNAME = "testing_app"
FLUTTER_APPLICATION_INSTALL_SUFFIX = "flutter-samples-testing-app"
FLUTTER_APPLICATION_PATH = "testing_app"

inherit flutter-app