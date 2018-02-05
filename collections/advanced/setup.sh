#!/bin/bash

KATA="collections-advanced"
read -d '' CONTENTS << EOF
EOF

source ../../.shared/utils.sh
initkata $KATA $CONTENTS
