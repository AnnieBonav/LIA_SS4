import json

# Load the JSON file
with open('JSON/large-json.json') as file:
    largeData = json.load(file)

with open('JSON/data.json') as file:
    data = json.load(file)

def findKey(data, keyToLook):
    if isinstance(data, dict):
        for key, value in data.items():
            if key == keyToLook:
                return value
            elif isinstance(value, (dict, list)):
                result = findKey(value, keyToLook)
                if result is not None:
                    return result
    elif isinstance(data, list):
        for item in data:
            result = findKey(item, keyToLook)
            if result is not None:
                return result
    return None

# print("DIRECT VALUES")
# directMacAddress = data["Reservations"][0]["Instances"][0]["NetworkInterfaces"][0]["MacAddress"]
# directPrivateIpAddress = data["Reservations"][0]["Instances"][0]["NetworkInterfaces"][0]["PrivateIpAddress"]
# directPublicIp = data["Reservations"][0]["Instances"][0]["PublicIpAddress"]
# directSubnetId = data["Reservations"][0]["Instances"][0]["SubnetId"]

# print(f"Direct MacAddress: {directMacAddress}")
# print(f"Direct PrivateIpAddress: {directPrivateIpAddress}")
# print(f"Direct PublicIp: {directPublicIp}")
# print(f"Direct SubnetId: {directSubnetId}")

# print("FINDNG VALUES\n")
# mac_address = findKey(data, "MacAddress")
# private_ip_address = findKey(data, "PrivateIpAddress")
# public_ip = findKey(data, "PublicIpAddress")
# subnet_id = findKey(data, "SubnetId")

# print(f"MacAddress: {mac_address}")
# print(f"MacAddress: {mac_address}")
# print(f"PrivateIpAddress: {private_ip_address}")
# print(f"PublicIp: {public_ip}")
# print(f"SubnetId: {subnet_id}")

loginA = "rspt"
loginB = "stevewest"
for user in largeData:
    login = findKey(user, "login")
    if login == loginB:
        repo = findKey(user, "repo")
        print("The login '" + login + "' has the repo:" + str(repo) + "\n\n")
        break


