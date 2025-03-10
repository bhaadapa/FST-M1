#actiity 20- not working - plz check
# Import pandas
import pandas
from pandas import ExcelWriter

# Create a dictionary that will be used to create the DataFrame
data = {
	'FirstName':["Satvik", "Avinash", "Lahri"],
	'LastName':["Shah", "Kati", "Rath"],
	'Email':["satshah@example.com", "avinashK@example.com", "lahri.rath@example.com"],
	'PhoneNumber':["4537829158", "4892184058", "4528727830"]
}

#------activity20
df = pandas.DataFrame(data)
writer = ExcelWriter("sample.xlsx")
df.to_excel(writer,"sheet1",index=False)
writer.close

input_data = pandas.read_excel("sample.xlsx")

print("no.of rows:",input_data.shape[0])
print("no.of cols:",input_data.shape[1])
print(input_data["email"])
print(input_data.sort_values("FirstName"))
