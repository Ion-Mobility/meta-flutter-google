#
# Copyright (c) 2020-2024 Joel Winarske. All rights reserved.
#

SUMMARY = "super_dash"
DESCRIPTION = "A Very Good Platformer Game generated by Very Good CLI."
AUTHOR = "Google"
HOMEPAGE = "None"
BUGTRACKER = "None"
SECTION = "graphics"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c86726684354692a7dc458504fecd5fc"

SRCREV = "38b7a9a819d69fe8d59d4a0cea744d6ca353616f"
SRC_URI = " \
    git://github.com/flutter/super_dash;lfs=0;branch=main;protocol=https;destsuffix=git \
    file://super_dash/0001-ivi-homescreen-support.patch \
    file://super_dash/0001-intl-0.19.0.patch \
"

S = "${UNPACKDIR}/git"

PUBSPEC_APPNAME = "super_dash"
FLUTTER_APPLICATION_INSTALL_SUFFIX = "flutter-super-dash-super-dash"
PUBSPEC_IGNORE_LOCKFILE = "1"
FLUTTER_APPLICATION_PATH = ""
FLUTTER_BUILD_ARGS = "bundle --target lib/main_prod.dart --dart-define FLUTTER_APP_FLAVOR=prod"
APP_AOT_EXTRA = "-DFLUTTER_APP_FLAVOR=prod"
APP_AOT_ENTRY_FILE = "main_prod.dart"

do_compile[network] = "1"

inherit flutter-app
