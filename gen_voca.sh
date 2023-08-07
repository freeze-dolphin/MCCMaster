#!/usr/bin/env bash

voca=$(sed -n "$(bb rand.clj --limit=12299)p" dict.txt)

bb gen_name.clj --voca="$voca"
