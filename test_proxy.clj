#!/usr/bin/env bb

(require '[clojure.string :as st]
         '[babashka.process :refer [shell process exec]])

(def proxy-list "185.198.190.164:12444\n183.164.243.169:8089\n38.44.237.59:999\n36.6.145.206:8089\n187.84.242.52:8080\n36.6.145.142:8089\n60.174.1.98:8089\n59.59.212.94:8089\n95.189.103.14:3128\n183.164.243.156:8089\n58.214.243.91:80\n94.154.152.10:8079\n60.174.0.171:8089\n47.242.11.185:59394\n94.75.76.3:8080\n185.245.81.173:12444\n103.83.178.46:8181\n117.54.114.35:80\n43.135.21.117:3128\n36.6.145.76:8089\n109.86.182.203:3128\n153.121.36.194:8118\n200.215.248.114:999\n94.102.234.186:32650\n117.71.149.242:8089\n36.89.156.146:8080\n114.102.46.61:8089\n103.138.71.109:8080\n213.59.141.76:58000\n95.38.75.162:8080\n36.6.145.38:8089\n49.71.118.135:8089\n43.225.198.58:80\n47.250.39.193:8080\n206.189.135.64:80\n213.6.28.85:8080\n51.68.181.108:80\n201.220.157.1:999\n43.154.71.116:59394\n52.67.200.192:3128\n38.7.131.1:999\n36.6.145.240:8089\n182.34.103.237:9999\n190.97.232.200:999\n45.148.17.46:8118\n183.164.242.202:8089\n89.108.127.108:40016\n85.62.10.87:8080\n140.227.68.230:58888\n190.83.3.34:999\n74.114.232.162:8080\n84.54.185.203:8080\n117.69.233.178:8089\n51.79.87.8:8888\n45.189.113.57:999\n203.142.71.51:8080\n88.255.102.7:8080\n182.16.171.65:43188\n68.183.209.208:80\n41.204.87.90:8080\n38.41.0.88:999\n114.231.46.108:8888\n36.6.144.17:8089\n103.52.213.131:80\n128.199.4.176:80\n202.182.55.42:8080\n103.149.194.214:8080\n52.36.0.173:8118\n43.249.10.237:45787\n103.167.69.90:8080\n109.254.75.200:9090\n45.201.209.137:8081\n49.71.141.211:7788\n52.39.97.195:80\n95.216.153.90:80\n223.215.177.177:8089\n43.130.147.86:80\n68.183.132.166:80\n46.209.207.155:8080\n183.164.243.112:8089\n103.77.60.14:80\n103.54.43.131:8080\n119.8.120.4:80\n45.56.82.78:80\n103.149.194.79:32650\n36.6.145.104:8089\n51.83.98.90:80\n82.65.205.55:8118\n221.230.216.178:7788\n45.160.78.238:999\n43.251.119.12:45787\n95.217.212.34:8080\n221.230.216.170:7788\n210.140.170.236:80\n37.210.135.223:8080\n49.70.99.235:8089\n89.144.19.150:7771\n193.38.139.119:8443\n103.76.27.36:8080\n82.165.126.36:80\n36.6.145.107:8089\n60.174.1.168:8089\n131.100.51.105:999\n162.252.84.93:80\n200.106.187.252:999\n72.169.67.17:87\n104.129.206.37:8800\n47.103.201.22:8118\n117.158.146.215:9091\n201.174.38.176:999\n8.135.48.42:8080\n183.164.243.154:8089\n38.51.49.164:999\n60.188.5.145:80\n45.15.153.183:3128\n36.6.144.226:8089\n8.140.51.59:7890\n45.179.193.163:999\n195.174.142.76:8080\n104.19.179.90:80\n103.162.154.14:8888\n175.106.15.182:8080\n183.164.242.94:8089\n47.98.134.232:9992\n5.158.124.152:5555\n49.85.15.235:9000\n1.1.1.231:80\n123.200.20.6:8080\n43.251.119.211:45787\n54.145.156.120:80\n202.21.110.82:8020\n41.86.252.91:443\n103.118.47.243:8080\n114.232.109.3:8888\n71.172.10.163:3128\n78.39.219.133:8080\n114.106.147.73:8089\n104.19.18.25:80\n114.231.41.177:8888\n201.238.248.139:9229\n60.188.5.214:80\n178.54.21.203:8081\n36.6.145.13:8089\n114.102.44.64:8089\n43.243.172.18:83\n194.44.172.254:23500\n103.120.175.243:9191\n45.239.123.17:999\n45.133.168.5:8080\n172.67.182.104:80\n38.45.251.240:999\n103.124.173.101:83\n183.247.152.98:53281\n198.74.121.133:8101\n5.202.53.65:8080\n1.1.1.20:80\n37.148.217.243:999\n103.98.131.194:8081\n77.238.79.111:8080\n81.162.218.247:32650\n77.170.113.50:3128\n154.70.107.81:3128\n187.102.200.77:999\n202.29.222.254:8080\n49.89.176.175:9128\n186.166.138.54:999\n36.67.11.155:4480\n79.132.200.224:8080\n81.12.40.253:8080\n202.180.54.211:8080\n43.252.158.41:8080\n36.67.149.246:8080\n51.195.246.56:1080\n43.251.117.67:45787\n196.251.222.229:8103\n195.255.96.90:80\n85.192.40.31:7777\n103.212.239.42:3125\n45.175.237.184:999\n38.51.48.93:999\n183.164.243.167:8089\n185.169.232.219:12000\n89.237.35.10:37647\n200.170.210.238:8080\n36.6.144.19:8089\n91.121.169.13:5566\n143.110.231.165:80\n190.61.46.227:999\n36.94.232.177:3113\n36.6.144.218:8089\n159.138.252.45:8080\n146.70.20.222:8080\n60.167.103.114:1133\n60.167.20.196:1133\n45.6.201.224:8080\n103.226.232.188:3125\n43.227.129.65:83\n183.164.242.46:8089\n64.225.4.85:9994\n61.7.174.205:8080\n223.247.46.181:8089\n36.6.144.52:8089\n183.164.243.81:8089\n183.164.243.236:8089\n38.10.179.196:999\n68.183.210.249:80\n36.6.145.122:8089\n36.138.56.214:3128\n201.77.108.220:999\n157.245.27.11:31280\n181.174.115.10:1994\n172.67.15.82:80\n31.128.71.241:8081\n43.136.75.181:2080\n47.90.38.221:8080\n117.94.113.205:9000\n185.101.159.130:80\n36.6.144.3:8089\n36.67.11.41:8080\n45.162.72.27:999\n41.33.86.242:8080\n94.26.210.205:8080\n221.230.216.128:7788\n223.215.176.180:8089\n42.63.65.117:80\n104.21.69.223:80\n185.174.111.220:41002\n183.164.242.58:8089\n51.15.9.242:21\n41.65.146.181:1976\n221.230.216.40:7788\n223.247.47.46:8089\n168.228.233.167:999\n201.174.152.186:999\n112.54.47.55:9091\n182.72.203.246:80\n190.2.215.10:999\n36.6.144.77:8089\n51.68.177.235:8080\n49.89.87.164:8089\n112.87.140.162:443\n178.212.196.177:9999\n123.126.158.50:80\n103.69.38.1:8080\n47.99.143.175:80\n43.249.11.229:45787\n104.18.16.1:80\n191.7.216.31:8080\n60.174.1.125:8089\n45.15.153.144:3128\n167.71.110.174:8118\n45.174.92.200:999\n113.223.213.43:8089\n149.202.168.208:80\n67.227.250.240:80\n171.221.210.114:80\n64.227.6.0:4003\n176.235.139.38:10001\n198.11.175.180:8045\n113.53.53.7:8080\n104.20.0.87:80\n179.49.157.10:999\n104.17.112.20:80\n60.174.0.70:8089\n49.89.103.243:8089\n20.50.107.111:80\n199.89.55.114:3128\n58.65.129.133:3128\n45.4.203.115:999\n49.71.140.76:7788\n41.65.236.58:1981\n45.184.128.94:8181\n36.6.145.103:8089\n120.25.220.179:8118\n45.82.15.11:8888\n181.65.139.229:999\n222.190.173.102:8089\n36.6.144.251:8089\n18.116.189.103:80\n193.255.61.79:80\n111.225.152.197:8089\n36.6.145.16:8089\n78.137.83.195:8080\n12.27.168.161:9080\n47.89.25.204:9085\n36.6.145.203:8089\n203.190.44.225:1111\n184.82.130.44:8080\n183.164.243.119:8089\n183.165.247.63:8089\n89.237.32.177:37647\n41.169.78.142:8080\n61.7.157.51:8080\n91.150.77.57:54037\n61.144.148.134:9000\n88.193.155.140:8119\n51.15.49.234:3128\n181.209.117.50:8080\n49.70.99.141:8089\n45.81.145.131:8080\n177.101.0.199:8080\n115.124.68.226:8080\n110.232.67.43:55443\n59.60.208.26:8089\n104.17.114.180:80\n103.194.172.186:8080\n183.164.243.95:8089\n103.157.219.4:80\n80.91.125.238:8089\n59.120.115.118:8080\n187.86.133.125:3128\n49.85.15.96:9000\n45.194.19.222:1091\n35.154.255.201:80\n169.54.88.101:80\n114.102.45.238:8089\n80.249.135.209:8080\n67.227.170.50:80\n61.184.189.43:63000\n64.225.8.191:9978\n165.225.124.110:10605\n102.68.128.219:8080\n62.33.207.201:3128\n188.235.0.207:8181\n207.180.216.251:8118\n4.246.218.125:80\n195.200.215.158:3199\n45.70.221.145:18080\n185.195.107.16:23445\n104.16.122.175:80\n117.186.232.73:8080\n139.255.67.54:3888\n37.148.216.60:999\n45.201.134.38:8080\n49.71.119.58:8089\n49.89.103.50:8089\n188.94.224.161:8080\n45.190.77.215:999\n36.6.144.80:8089\n186.125.152.19:8080\n103.215.207.65:82\n202.43.110.168:8080\n89.144.19.151:7771\n195.138.85.104:41890\n223.247.47.36:8089\n67.205.136.102:80\n60.174.1.219:8089\n195.201.34.206:80\n84.255.35.210:9898\n181.129.74.58:40667\n186.125.218.234:999\n111.1.27.85:80\n223.215.177.72:8089\n136.233.136.41:48976\n144.48.62.172:12000\n204.199.129.38:999\n177.69.180.171:8080\n61.164.147.242:80\n179.42.78.25:999\n103.180.112.120:8080\n192.198.61.138:8080\n210.210.178.22:11116\n43.254.126.41:1080\n185.195.105.59:12333\n59.59.214.182:8089\n49.68.68.218:8089\n45.5.116.245:6969\n67.205.179.93:31028\n68.183.164.35:80\n31.220.73.234:3128\n179.1.110.77:8080\n183.164.243.240:8089\n103.146.197.91:8181\n51.83.98.7:80\n45.5.116.152:999\n103.138.71.117:3125\n84.22.42.61:3128\n114.102.45.29:8089\n36.95.15.146:8080\n103.165.155.19:8080\n5.42.82.96:3128\n190.104.20.84:8080\n138.68.235.51:80\n123.200.7.110:8080\n178.128.31.16:3128\n36.6.145.105:8089\n45.133.168.4:8080\n185.200.38.199:8080\n186.121.235.66:8080\n202.51.192.106:8080\n200.37.140.34:10101\n59.60.210.26:8089\n47.100.69.29:8888\n92.255.7.162:8080\n60.188.5.162:80\n77.69.170.26:3128\n190.109.205.253:999\n115.124.76.195:8080\n200.58.87.195:8080\n49.89.72.64:8089\n37.255.134.36:8080\n191.101.214.7:3128\n51.79.243.158:6789\n91.143.88.93:3128\n193.253.220.32:80\n182.204.180.146:8089\n117.139.124.182:9091\n3.17.70.181:80\n185.215.235.174:80\n47.91.104.110:2000\n88.255.65.118:8080\n183.164.243.97:8089\n200.123.29.42:3128\n180.211.161.110:8080\n8.130.31.161:7890\n125.17.4.72:8080\n223.247.47.223:8089\n185.195.105.44:12333\n223.19.111.185:80\n54.245.175.159:3128\n191.97.0.126:999\n117.69.237.103:8089\n172.190.179.177:443\n36.6.144.160:8089\n47.87.213.187:8080\n185.178.47.135:80\n103.219.23.155:41002\n136.228.223.16:80\n94.131.100.141:8080\n45.133.168.58:8080\n36.6.144.252:8089\n117.69.237.181:8089\n178.213.24.216:8080\n185.141.58.212:19596\n52.23.29.116:8080\n183.88.134.179:8080\n43.132.29.156:9999\n200.201.223.164:80\n39.105.51.125:80\n165.22.103.5:443\n103.167.69.94:8080\n85.206.175.181:3128\n36.6.144.182:8089\n173.212.195.139:80\n147.78.169.80:8443\n117.207.147.21:3127\n104.16.157.77:80\n185.169.232.130:12000\n43.240.101.89:8080\n200.91.204.51:999\n18.190.67.239:80\n183.164.243.134:8089\n103.227.192.46:8111\n185.195.106.227:23445\n98.32.177.204:80\n103.65.237.150:3125\n93.189.95.118:80\n92.205.187.58:3128\n43.251.118.237:45787\n183.89.208.108:8080\n47.96.133.60:80\n203.110.176.69:8111\n183.164.243.64:8089\n38.56.70.75:999\n34.122.187.196:80\n45.190.170.254:999\n45.70.200.97:999\n194.87.58.76:80\n185.162.230.10:80\n49.71.141.147:7788\n217.12.49.30:8080\n65.111.241.215:80\n222.111.18.67:80\n203.24.109.107:80\n3.11.140.45:80\n193.138.178.246:8282\n114.231.8.35:8888\n60.174.0.210:8089\n139.5.132.245:8080\n103.124.198.134:3125\n183.164.243.166:8089\n5.161.52.192:5190\n45.90.217.216:3128\n90.84.17.133:3128\n38.7.199.192:8080\n41.205.24.84:8080\n103.196.40.222:3125\n12.36.95.132:8080\n98.110.236.35:8080\n212.227.155.59:80\n51.223.152.75:8080\n183.164.243.62:8089\n103.174.66.195:8080\n221.230.216.118:7788\n51.161.118.103:8118\n42.228.61.245:9091\n181.225.78.57:999\n45.238.55.38:999\n43.133.13.29:59394\n223.215.177.226:8089\n136.226.33.106:443\n41.169.135.242:8080\n46.46.180.69:9580\n183.164.243.161:8089\n41.65.160.173:1981\n177.130.104.134:33333\n5.157.46.38:41002\n103.216.48.115:8080\n183.164.243.49:8089\n114.102.46.153:8089\n45.114.145.201:32650\n45.133.168.68:8080\n5.36.87.146:8080\n59.58.43.77:8089\n183.164.242.55:8089\n84.204.40.154:8080\n50.84.107.94:8111\n20.111.54.16:8123\n46.40.6.201:7777\n170.239.87.226:80\n18.170.22.115:80\n45.174.11.2:3021\n38.44.237.60:999\n85.214.35.234:8080\n82.157.194.44:7890\n103.134.98.33:83\n181.209.117.52:8080\n112.124.2.212:59394\n103.156.233.161:3125\n47.120.0.119:1080\n31.28.4.192:80\n80.251.49.103:8001\n206.62.165.6:999\n180.103.59.116:8089\n183.164.243.39:8089\n82.165.21.59:80\n114.231.82.176:8089\n179.190.97.135:8080\n196.20.125.157:8083\n183.164.242.198:8089\n49.71.144.149:8089\n47.245.97.176:9000\n123.182.59.178:8089\n103.156.17.39:8181\n103.31.251.124:8080\n179.48.15.160:80\n36.6.145.130:8089\n223.247.46.243:8089\n5.45.110.158:8080\n103.153.246.65:3125\n49.85.15.236:9000\n103.180.251.12:8080\n221.154.134.26:80\n201.14.117.51:8080\n186.208.139.194:8080\n136.226.33.108:80\n43.241.69.35:80\n103.165.245.23:8080\n65.21.106.116:8080\n45.10.71.61:45787\n49.71.140.108:7788\n199.60.103.212:80\n81.68.168.32:7890\n128.171.177.35:80\n47.254.244.107:3128\n43.251.116.205:45787\n59.60.210.222:8089\n45.224.99.89:999\n77.46.138.233:8080\n43.251.118.148:45787\n85.133.151.109:3128\n37.237.134.179:32650\n185.47.222.71:8080\n59.60.210.105:8089\n191.37.208.154:8080\n190.26.201.194:8080\n61.5.11.170:3128\n49.71.118.89:8089\n128.199.116.34:4444\n191.97.96.208:8080\n158.140.169.86:80\n185.23.110.106:8080\n65.109.4.0:10000\n103.191.155.46:8080\n43.249.10.82:45787\n106.249.44.10:3128\n60.174.1.85:8089\n39.105.31.166:3000\n104.129.194.43:80\n43.155.89.7:33229\n196.216.132.196:8082\n49.7.11.187:80\n85.133.151.24:3128\n45.236.31.21:999\n49.89.222.154:8089\n45.133.168.105:8080\n45.8.104.240:80\n88.199.164.140:8081\n195.245.76.45:3128\n51.79.142.230:38414\n206.189.98.104:8118\n110.49.34.126:32650\n203.142.69.250:8080\n221.226.75.86:55443\n103.96.221.5:32650\n85.31.246.47:3128\n36.6.144.254:8089\n45.70.200.81:999\n20.219.118.36:80\n187.62.191.3:61456\n36.6.145.165:8089\n36.6.145.172:8089\n46.209.207.146:8080\n47.88.62.42:80\n37.143.8.84:3128\n107.174.14.102:34333\n82.157.12.9:7890\n103.88.143.34:8081\n43.224.119.34:80\n36.91.133.49:10000\n157.100.7.146:999\n136.228.160.250:8080\n190.109.168.217:8080\n80.91.17.58:80\n103.152.119.155:80\n121.133.5.61:80\n46.8.19.27:8443\n170.81.241.203:999\n49.85.15.72:9000\n27.72.104.89:8080\n183.164.242.64:8089\n20.74.169.104:8118\n77.51.193.155:3128\n181.177.141.93:8087\n87.236.197.89:80\n103.161.30.1:83\n60.174.0.219:8089\n5.157.46.31:41002\n223.113.80.158:9091\n103.105.228.35:8080\n38.51.237.16:999\n203.128.80.178:8099\n202.180.19.46:8080\n50.232.250.157:8080\n117.54.130.66:53281\n117.71.132.235:8089\n45.224.22.177:999\n39.106.60.216:3128\n89.237.33.97:37647\n95.31.22.173:7777\n120.194.4.157:5443\n181.129.182.99:999\n123.182.59.120:8089\n46.34.174.60:8090\n103.162.154.3:8888\n23.152.40.15:3128\n8.242.205.41:9991\n45.229.6.81:999\n106.54.88.99:8888\n36.6.144.230:8089\n38.7.131.254:999\n64.62.200.198:3128\n43.251.119.69:45787\n78.25.123.69:3128\n41.33.66.238:1981\n172.190.30.64:3128\n172.67.21.175:80\n154.64.211.145:999\n176.118.50.239:53281\n194.244.232.53:8080\n211.45.175.45:80\n45.180.16.213:9292\n202.180.20.66:8080\n68.183.131.15:80\n52.66.64.116:3128\n190.104.134.145:3128\n77.46.138.38:8080\n91.223.128.10:55055\n212.101.74.74:443\n104.233.54.54:3199\n200.123.29.40:3128\n38.47.238.145:3128\n104.21.19.4:80\n198.52.241.7:999\n91.121.106.55:4444\n36.6.145.102:8089\n82.146.39.160:3128\n102.132.50.33:8080\n114.231.45.53:8089\n49.71.147.108:7788\n139.224.228.147:1080\n65.21.157.202:10423\n36.6.145.180:8089\n190.210.228.73:80\n43.249.10.223:45787\n103.156.71.86:8880\n1.0.171.213:8080\n117.54.114.101:80\n223.247.47.37:8089\n47.243.125.236:59394\n104.19.125.221:80\n103.178.88.138:80\n188.142.224.225:80\n167.71.1.130:3128\n114.104.135.119:41122\n114.231.42.217:8888\n68.183.104.118:80\n45.184.124.33:1985\n103.147.128.65:83\n138.68.102.28:3128\n117.69.236.199:8089\n117.69.237.175:8089\n181.65.200.53:80\n67.205.134.177:80\n202.142.155.162:41890\n121.128.194.154:80\n190.115.15.21:999\n60.174.0.116:8089\n45.70.202.13:8089\n193.36.39.35:80\n36.6.144.187:8089\n113.223.214.214:8089\n183.164.242.220:8089\n38.49.158.78:999\n39.173.102.18:80\n191.6.15.104:8080\n103.52.145.97:8080\n45.133.168.121:8080\n116.203.28.43:80\n183.165.244.117:8089\n92.45.121.6:3128\n203.190.54.217:6666\n159.69.204.95:8118\n43.249.10.120:45787\n118.98.166.56:8080\n47.91.126.36:8080\n80.81.243.26:80\n41.33.3.39:1981\n186.194.160.13:8080\n198.11.175.192:9000\n39.100.120.200:7890\n36.6.145.53:8089\n60.174.1.9:8089\n112.17.173.55:9091\n94.154.152.45:8079\n113.223.215.185:8089\n103.162.16.81:4995\n82.180.163.163:80\n102.213.84.250:8080\n121.40.115.140:8080\n41.65.102.85:1976\n103.155.196.133:3125\n213.191.194.24:80\n136.226.33.107:80\n101.251.204.174:8080\n190.97.232.197:999\n203.32.120.72:80\n102.68.128.214:8080\n223.215.176.178:8089\n181.212.41.171:999\n45.177.98.139:999\n45.234.60.3:999\n206.62.161.211:999\n93.20.25.100:80\n185.174.109.201:41002\n45.133.168.64:8080\n8.219.210.112:8080\n41.57.15.12:8080\n65.102.72.224:81\n49.71.144.36:8089\n103.92.101.115:8080\n181.209.111.149:999\n181.143.106.162:52151\n103.165.253.137:3125\n103.114.11.197:8080\n38.51.48.186:999\n62.218.24.135:80\n119.252.171.50:8080\n200.37.140.36:10101\n201.71.2.149:999\n85.117.56.147:8080\n94.231.192.85:8080\n154.236.191.50:1981\n20.219.137.240:3000\n185.15.172.212:3128\n172.105.25.190:80\n43.249.10.24:45787\n54.67.89.188:3128\n95.216.26.6:80\n192.140.42.83:31511\n85.109.104.100:9090\n114.231.82.62:8888\n39.96.140.81:8118\n20.198.115.180:3129\n49.71.144.47:8089\n37.57.15.43:33761\n187.62.64.156:45005\n185.141.58.203:19596\n114.231.45.228:8888\n80.89.198.229:80\n47.96.145.134:80\n113.223.214.168:8089\n54.173.15.239:9999\n14.161.33.150:8080\n36.6.145.35:8089\n80.154.6.2:8000\n38.51.237.4:999\n91.98.137.87:8080\n185.174.111.217:41002\n110.74.195.34:25\n46.97.223.23:8088\n49.71.118.34:8089\n217.79.189.88:5566\n92.255.205.129:8080\n201.77.108.48:999\n49.71.118.143:8089\n45.6.203.224:8080\n185.195.105.20:12333\n212.33.238.17:8111\n172.67.182.125:80\n72.169.67.1:87\n114.231.41.24:8888\n157.119.221.23:8080\n191.240.153.144:8080\n60.174.1.120:8089\n183.164.242.96:8089\n129.151.204.192:8080\n114.102.45.133:8089\n154.3.9.17:8081\n185.215.235.85:80\n153.126.205.18:80\n167.99.174.59:80\n61.132.228.99:8088\n114.102.44.109:8089\n49.234.67.35:7890\n82.223.102.92:9443\n94.200.240.102:8080\n182.92.8.235:8888\n75.114.77.34:8080\n62.201.219.53:8186\n223.215.176.177:8089\n43.251.119.48:45787\n117.71.149.236:8089\n41.216.186.55:8080\n186.24.9.114:999\n49.71.140.9:7788\n46.249.123.146:514\n43.239.152.77:32650\n91.109.141.53:53281\n36.6.145.205:8089\n41.33.254.186:1976\n109.248.249.37:8081\n46.161.254.217:8080\n203.142.69.254:8080\n124.105.183.73:8082\n14.177.235.17:8080\n125.26.4.221:8080\n46.251.22.215:80\n91.185.53.230:8080\n36.6.145.153:8089\n103.145.128.179:8088\n218.91.127.132:8089\n194.182.187.78:3128\n208.163.39.218:53281\n180.211.158.122:58375\n170.246.85.107:50991\n117.57.93.229:8089\n36.6.144.154:8089\n113.223.214.105:8089\n1.53.252.228:2022\n36.6.145.26:8089\n177.136.86.137:999\n202.104.205.86:9090\n181.233.62.2:999\n36.6.145.30:8089\n138.2.64.185:8118\n104.20.113.188:80\n45.184.155.14:999\n221.145.15.171:80\n61.216.73.122:8888\n81.68.102.162:8888\n138.97.37.115:8189\n94.102.236.17:32650\n45.12.30.135:80\n49.70.11.224:8089\n49.71.147.12:7788\n36.91.46.26:8080\n44.202.243.108:9999\n143.110.232.177:80\n183.164.243.16:8089\n117.50.175.254:7890\n47.113.177.122:7890\n49.71.140.233:7788\n60.189.132.153:8085\n185.162.248.216:3128\n5.9.37.26:8080\n20.55.69.234:3128\n51.68.220.201:8080\n136.228.243.159:80\n52.149.178.39:80\n95.217.191.216:8080\n165.227.80.229:3128\n183.164.243.34:8089\n49.84.102.229:8089\n117.160.250.133:80\n119.13.103.211:20201\n45.133.168.76:8080\n45.236.28.68:999\n3.0.98.88:80\n111.68.25.49:8080\n94.154.152.116:8079\n154.236.168.179:1981\n182.93.82.191:8080\n45.179.193.77:999\n36.6.145.210:8089\n181.205.241.227:999\n203.176.179.255:8080\n5.158.126.16:3128\n202.180.21.203:8009\n185.195.107.24:23445\n60.174.1.93:8089\n82.66.75.98:49400\n187.102.216.219:999\n65.21.144.121:3128\n103.78.9.198:10001\n158.180.69.235:3128\n101.231.45.34:7086\n114.231.41.67:8888\n185.195.105.26:12333\n85.206.175.161:3128\n45.190.216.202:8080\n45.5.116.242:8080\n183.164.243.106:8089\n103.41.90.49:83\n186.194.163.254:8080\n91.82.113.253:8080\n81.94.255.12:8080\n83.40.217.121:80\n160.20.165.25:999\n3.225.17.174:443\n148.76.97.250:80\n41.65.160.174:1981\n109.254.30.74:9090\n120.55.49.231:1234\n45.112.127.191:80\n154.236.191.49:1981\n59.98.151.201:8080\n36.93.6.171:8080\n213.226.11.149:41878\n181.118.143.1:999\n103.237.78.102:4995\n38.49.130.136:999\n109.195.230.143:8080\n177.244.34.58:999\n181.78.27.33:999\n190.90.39.78:999\n1.27.226.210:8060\n150.230.210.154:3128\n163.172.31.44:80\n179.0.42.244:999\n111.68.26.237:8080\n117.69.237.105:8089\n113.223.214.155:8089\n36.6.145.106:8089\n81.91.32.90:8080\n45.224.99.2:999\n185.215.235.196:80\n94.231.192.97:8080\n59.60.208.158:8089\n175.100.103.170:55443\n47.105.80.6:80\n91.225.48.111:8888\n92.255.202.78:8080\n97.107.142.202:8080\n116.206.243.50:80\n43.249.10.108:45787\n165.16.27.36:1981\n49.70.89.49:8089\n95.217.20.26:3128\n45.251.139.87:45787\n144.48.62.253:12000\n38.56.70.97:999\n61.7.146.7:8082\n60.174.0.139:8089\n45.63.25.2:8888\n181.209.125.122:999\n223.215.177.185:8089\n159.146.90.187:8080\n49.85.95.245:9000\n185.141.59.128:19596\n51.68.140.229:8080\n46.101.204.134:80\n45.159.251.247:80\n85.214.136.215:80\n103.135.14.176:8181\n146.70.145.196:8080\n38.7.131.249:999\n170.246.85.38:50991\n181.177.76.119:3199\n49.71.140.244:7788")

(doseq [pxy (st/split proxy-list #"\n")]
  (process {:out (str "logs/" pxy ".log")} (str "httping -x " pxy " -g http://www.baidu.com -t 30")))