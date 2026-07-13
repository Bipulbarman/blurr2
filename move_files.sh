#!/bin/bash

# Extract the blurr.zip file
unzip -q blurr.zip

# Move all contents from blurr directory to root
if [ -d "blurr" ]; then
    mv blurr/* .
    rmdir blurr
    echo "Successfully moved all files from blurr directory to root"
else
    echo "blurr directory not found"
fi
