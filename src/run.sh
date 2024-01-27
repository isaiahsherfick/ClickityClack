#!/usr/bin/env sh

javac --module-path $PATH_TO_FX/lib --add-modules javafx.controls ScreenCaptureUI.java && java --module-path $PATH_TO_FX/lib --add-modules javafx.controls ScreenCaptureUI
