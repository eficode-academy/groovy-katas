#!/bin/bash

KATA="native-processes-basic"
read -d '' CONTENTS << EOF
EOF

source ../../.shared/utils.sh
initkata $KATA $CONTENTS
