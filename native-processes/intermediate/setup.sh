#!/bin/bash

KATA="native-processes-basic"
read -d '' CONTENTS << EOF
EOF

source ../../.shared/utils.sh
initkata $KATA $CONTENTS

cp ../../../.shared/pre-existing/native-processes-intermediate.groovy today-is.groovy
