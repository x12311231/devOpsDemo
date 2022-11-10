官网下载：https://github.com/goharbor/harbor/releases

harbor-offline-installer-v.*.tgz

tar -zxf harbor-offline-installer-v.*.tgz

cd harbor

cp harbor.yml.tmpl harbor.yml
//修改hostname: reg.mydomain.com

sudo ./install.sh

