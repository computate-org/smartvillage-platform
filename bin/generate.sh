#!/bin/bash

cd $HOME/.local/src/smartvillage-platform
env SITE_NAME=smartvillage-platform SITE_PATH=$HOME/.local/src/smartvillage-platform COMPUTATE_SRC=$HOME/.local/src/computate SITE_LANG=enUS $HOME/.local/src/computate/bin/enUS/generate.sh

