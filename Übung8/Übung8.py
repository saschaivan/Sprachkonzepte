import requests
import json
import re

parameters = {
	"jahr": 2022,
	"nur_land": "BW"
} 

response = requests.get("https://feiertage-api.de/api/", params=parameters)

feiertage = []

with open('json_data.json', 'w') as outfile:
    json.dump(response.json(), outfile, indent=4, sort_keys=True)

outfile.close()

for x in response.json().keys():
	feiertage.append(x)

for x in feiertage:
	pattern = "^Tag"
	z = re.search(pattern, x)
	if(z):
		print(z.string)
 
