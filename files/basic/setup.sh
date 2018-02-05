#!/bin/bash

KATA="files-basic"
read -d '' CONTENTS << EOF
EOF

source ../../.shared/utils.sh
initkata $KATA $CONTENTS

read -d '' FILE_CONTENTS << EOF
opponent,round1,round2,round3
red-sheep,7,13,11
blue-dogs,13,11,N/A
yellow-canaries,11,10,13
green-cows,6,4,N/A
EOF

echo "$FILE_CONTENTS" > tournament-results.csv
