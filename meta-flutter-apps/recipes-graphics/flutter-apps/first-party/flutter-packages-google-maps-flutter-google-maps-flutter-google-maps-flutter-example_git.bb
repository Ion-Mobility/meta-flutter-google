#
# Copyright (c) 2020-2024 Joel Winarske. All rights reserved.
#

SUMMARY = "google_maps_flutter_example"
DESCRIPTION = "Demonstrates how to use the google_maps_flutter plugin."
AUTHOR = "Google"
HOMEPAGE = "None"
BUGTRACKER = "None"
SECTION = "graphics"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a60894397335535eb10b54e2fff9f265"

SRCREV = "754de1918a339270b70971b6841cf1e04dd71050"
SRC_URI = "git://github.com/flutter/packages.git;lfs=1;nobranch=1;protocol=https;destsuffix=git"

S = "${WORKDIR}/git"

PUBSPEC_APPNAME = "google_maps_flutter_example"
FLUTTER_APPLICATION_INSTALL_SUFFIX = "flutter-packages-google-maps-flutter-google-maps-flutter-google-maps-flutter-example"
FLUTTER_APPLICATION_PATH = "packages/google_maps_flutter/google_maps_flutter/example"

inherit flutter-app
