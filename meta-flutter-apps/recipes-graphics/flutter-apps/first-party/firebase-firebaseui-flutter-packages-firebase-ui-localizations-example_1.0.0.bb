#
# Copyright (c) 2020-2024 Joel Winarske. All rights reserved.
#

SUMMARY = "firebase_ui_localizations_example"
DESCRIPTION = "A new Flutter project."
AUTHOR = "Google"
HOMEPAGE = "None"
BUGTRACKER = "None"
SECTION = "graphics"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRCREV = "1a7104f541e323aa81a324c790605be1d463b5e5"
SRC_URI = "git://github.com/firebase/FirebaseUI-Flutter;lfs=0;branch=main;protocol=https;destsuffix=git"

S = "${UNPACKDIR}/git"

PUB_CACHE_EXTRA_ARCHIVE_PATH = "${WORKDIR}/pub_cache/bin"
PUB_CACHE_EXTRA_ARCHIVE_CMD = "flutter pub global activate melos; \
    melos bootstrap"

PUBSPEC_APPNAME = "firebase_ui_localizations_example"
FLUTTER_APPLICATION_INSTALL_SUFFIX = "firebase-firebaseui-flutter-packages-firebase-ui-localizations-example"
PUBSPEC_IGNORE_LOCKFILE = "1"
FLUTTER_APPLICATION_PATH = "packages/firebase_ui_localizations/example"

inherit flutter-app
