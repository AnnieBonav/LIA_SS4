import json
person = "{\"name\": \"Bob\", \"languages\": [\"English\", \"Fench\"]}"
person_dict = json.loads(person)

print(person_dict) # Output: {'name': 'Bob', 'languages': ['English', 'Fench']}
print(person_dict['languages']) # Output: ['English', 'French']
print(person_dict['languages']) # Output: ['English', 'French']

# JSON lint to check errors: https://jsonlint.com/
