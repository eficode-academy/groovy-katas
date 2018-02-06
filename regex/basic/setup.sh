#!/bin/bash

KATA="regex-basic"
read -d '' CONTENTS << EOF
String timestamp = "09:23:54"

// Timestamp regex:
// ([01]?[0-9]|2[0-3]):([0-5][0-9])(:?[0-5][0-9])?
EOF

source ../../.shared/utils.sh
initkata $KATA $CONTENTS
