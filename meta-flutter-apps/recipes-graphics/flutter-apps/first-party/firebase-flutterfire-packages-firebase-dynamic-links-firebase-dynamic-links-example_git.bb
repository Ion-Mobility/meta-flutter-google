#
# Copyright (c) 2020-2024 Joel Winarske. All rights reserved.
#

SUMMARY = "firebase_dynamic_links_example"
DESCRIPTION = "Demonstrates how to use the firebase_dynamic_links plugin."
AUTHOR = "Google"
HOMEPAGE = "None"
BUGTRACKER = "None"
SECTION = "graphics"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=93a5f7c47732566fb2849f7dcddabeaf"

SRCREV = "d41e30a808b47458d7ebd402862bcd55d8563ccb"
SRC_URI = "git://github.com/firebase/flutterfire.git;lfs=0;branch=master;protocol=https;destsuffix=git"

S = "${UNPACKDIR}/git"

PUB_CACHE_EXTRA_ARCHIVE_PATH = "${WORKDIR}/pub_cache/bin"
PUB_CACHE_EXTRA_ARCHIVE_CMD = "flutter pub global activate melos; \
    melos bootstrap"

PUBSPEC_APPNAME = "firebase_dynamic_links_example"
FLUTTER_APPLICATION_INSTALL_SUFFIX = "firebase-flutterfire-packages-firebase-dynamic-links-firebase-dynamic-links-example"
PUBSPEC_IGNORE_LOCKFILE = "1"
FLUTTER_APPLICATION_PATH = "packages/firebase_dynamic_links/firebase_dynamic_links/example"

inherit flutter-app
