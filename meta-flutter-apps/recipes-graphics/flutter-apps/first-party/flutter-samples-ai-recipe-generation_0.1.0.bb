#
# Copyright (c) 2020-2024 Joel Winarske. All rights reserved.
#

SUMMARY = "ai_recipe_generation"
DESCRIPTION = "A new Flutter project."
AUTHOR = "Google"
HOMEPAGE = "None"
BUGTRACKER = "None"
SECTION = "graphics"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b7eeb61b41ae366e94383bca5e113fce"

SRCREV = "f443fa60360d1e3a28c44626f4c146299259cc9b"
SRC_URI = "git://github.com/flutter/samples.git;lfs=1;nobranch=1;protocol=https;destsuffix=git"

S = "${WORKDIR}/git"

PUBSPEC_APPNAME = "ai_recipe_generation"
FLUTTER_APPLICATION_INSTALL_SUFFIX = "flutter-samples-ai-recipe-generation"
FLUTTER_APPLICATION_PATH = "ai_recipe_generation"

inherit flutter-app