#!/bin/bash

KATA="closures-intermediate"
read -d '' CONTENTS << EOF
EOF

source ../../.shared/utils.sh
initkata $KATA $CONTENTS
