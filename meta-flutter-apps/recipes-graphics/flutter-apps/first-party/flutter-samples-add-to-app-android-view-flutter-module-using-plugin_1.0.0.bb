#
# Copyright (c) 2020-2024 Joel Winarske. All rights reserved.
#

SUMMARY = "flutter_module_using_plugin"
DESCRIPTION = "An example Flutter module that uses a plugin."
AUTHOR = "Google"
HOMEPAGE = "None"
BUGTRACKER = "None"
SECTION = "graphics"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b7eeb61b41ae366e94383bca5e113fce"

SRCREV = "f443fa60360d1e3a28c44626f4c146299259cc9b"
SRC_URI = "git://github.com/flutter/samples.git;lfs=1;nobranch=1;protocol=https;destsuffix=git"

S = "${WORKDIR}/git"

PUBSPEC_APPNAME = "flutter_module_using_plugin"
FLUTTER_APPLICATION_INSTALL_SUFFIX = "flutter-samples-add-to-app-android-view-flutter-module-using-plugin"
FLUTTER_APPLICATION_PATH = "add_to_app/android_view/flutter_module_using_plugin"

inherit flutter-app
