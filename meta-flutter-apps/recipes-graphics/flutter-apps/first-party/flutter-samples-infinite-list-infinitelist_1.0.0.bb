#
# Copyright (c) 2020-2024 Joel Winarske. All rights reserved.
#

SUMMARY = "infinitelist"
DESCRIPTION = "A sample implementation of an infinite list."
AUTHOR = "Google"
HOMEPAGE = "None"
BUGTRACKER = "None"
SECTION = "graphics"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b7eeb61b41ae366e94383bca5e113fce"

SRCREV = "d62c784789683f09b92b81f964968251d5d630b7"
SRC_URI = "git://github.com/flutter/samples.git;lfs=1;branch=main;protocol=https;destsuffix=git"

S = "${UNPACKDIR}/git"

PUBSPEC_APPNAME = "infinitelist"
FLUTTER_APPLICATION_INSTALL_SUFFIX = "flutter-samples-infinite-list-infinitelist"
PUBSPEC_IGNORE_LOCKFILE = "1"
FLUTTER_APPLICATION_PATH = "infinite_list"

inherit flutter-app

do_compile[network] = "1"

