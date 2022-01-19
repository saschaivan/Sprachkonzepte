import requests
import json
import re

# Deklarationsfreie Syntax(dictionary) 
parameters = {
	"jahr": 2022,
	"nur_land": "BW"
} 
response = requests.get("https://feiertage-api.de/api/", params=parameters)
# Deklarationsfreie Syntax(Liste)
feiertage = []
with open('json_data.json', 'w') as outfile:
    json.dump(response.json(), outfile, indent=4, sort_keys=True)

outfile.close()

# ausgefeilter Umgang mit Strings
for x in response.json().keys():
	feiertage.append(x)
 
# Pattern Matching mit regulären Ausdrücken
for x in feiertage:
	pattern = "^Tag"
	z = re.search(pattern, x)
	if(z):
		print(z.string)
 
