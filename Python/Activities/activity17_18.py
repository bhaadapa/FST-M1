# Import pandas
import pandas

# Create a Dictionary that will hold our data
data = {
  "Usernames": ["admin", "Charles", "Deku"],
  "Passwords": ["password", "Charl13", "AllMight"]
}

# Create a DataFrame using that data
dataframe = pandas.DataFrame(data)

# Print the DataFrame
print(dataframe)

"""
 Write the DataFrame to a CSV file
 To avoid writing the index numbers to the file as well
 the index property is set to false
"""
dataframe.to_csv("sample.csv", index=False)


#converdata set into frame

df = pandas.DataFrame(data)
df.to_csv("sample.csv",index = False)
input_data = pandas.read_csv("sample.csv")
print(input_data["usernames"])
print(input_data["usernames"][1])
print(input_data["passwords"][1])
print(input_data.sort_values("usernames"))
print(input_data.sort_values("usernames",ascending=False))


