#
# Copyright (c) 2020-2024 Joel Winarske. All rights reserved.
#

SUMMARY = "example"
DESCRIPTION = "A project that showcases how to enable the recommended lints for Flutter apps, packages, and plugins."
AUTHOR = "Google"
HOMEPAGE = "None"
BUGTRACKER = "None"
SECTION = "graphics"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a60894397335535eb10b54e2fff9f265"

SRCREV = "f7b12561aeb6be92fc973441ae0f26cfaa8df8f4"
SRC_URI = "git://github.com/flutter/packages.git;lfs=1;branch=main;protocol=https;destsuffix=git"

S = "${WORKDIR}/git"

PUBSPEC_APPNAME = "example"
FLUTTER_APPLICATION_INSTALL_SUFFIX = "flutter-packages-flutter-lints-example"
FLUTTER_APPLICATION_PATH = "packages/flutter_lints/example"
PUBSPEC_IGNORE_LOCKFILE = "1"

inherit flutter-app
