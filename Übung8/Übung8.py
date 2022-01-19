import requests
import json

parameters = {
	"jahr": 2022,
	"nur_land": "BW"
}
response = requests.get("https://feiertage-api.de/api/", params=parameters)
with open('json_data.json', 'w') as outfile:
    json.dump(response.json(), outfile, indent=4, sort_keys=True)