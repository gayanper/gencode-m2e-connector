#!/bin/bash

API_KEY=$1
ARCHIVE=$2
VERSION=$3

curl -X PUT -T $ARCHIVE -ugayanper:$API_KEY https://api.bintray.com/content/gayanper/p2/gencode-m2e-connector/$VERSION/gencode-m2e-connector/$VERSION/archive-site.zip?explode=1
curl -X POST -ugayanper:$API_KEY https://api.bintray.com/content/gayanper/p2/gencode-m2e-connector/$VERSION/publish

