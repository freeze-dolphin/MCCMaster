#!/usr/bin/env bash

uid=$(cat /proc/sys/kernel/random/uuid)

mkdir -p workdir/"$uid"

cp mcc/MinecraftClient.ini workdir/"$uid"/conf.ini

sed -i 's/__USERNAME__/'"$(bb assemble_player_name.clj)"'/g' workdir/"$uid"/conf.ini
sed -i 's/__HOSTNAME__/'"127.0.0.1"'/g' workdir/"$uid"/conf.ini
sed -i 's/__PORT__/'"25565"'/g' workdir/"$uid"/conf.ini
sed -i 's/__PASSWD__/'"$RANDOM$RANDOM"'/g' workdir/"$uid"/conf.ini
#sed -i 's/{{BOT_TOKEN}}/'"$BOT_TOKEN"'/g' workdir/"$uid"/conf.ini

cd workdir/"$uid" && ln -s ../../mcc/MinecraftClient-20230802-227-linux-x64 bin
cd ../..

screenname=mcc-"$uid"
screen -dmS "$screenname"
screen -x -S "$screenname" -p 0 -X stuff "cd workdir/$uid && chmod +x bin && ./bin conf.ini && exit\n"
