import pandas as pd
import seaborn as sns
import matplotlib.pyplot as plt
import numpy as np
# Load the data from the CSV file
data = pd.read_csv("your_path_here",header=None, names=["Array Type", "Array Size", "Algorithm", "Time Taken"])



# Plot time taken by different algorithms across array sizes
plt.figure(figsize=(12, 6))
sns.lineplot(data=data, x="Array Size", y="Time Taken", hue="Algorithm", style="Array Type")
plt.title("Sorting Algorithm Performance by Array Size")
plt.xlabel("Array Size")
plt.ylabel("Time Taken (ms)")
plt.legend(title="Algorithm")
plt.show()




# Plot ECDF manually using lineplot
plt.figure(figsize=(12, 6))
for algorithm in data['Algorithm'].unique():
    subset = data[data['Algorithm'] == algorithm]
    sorted_times = np.sort(subset['Time Taken'])
    ecdf_values = np.arange(1, len(sorted_times) + 1) / len(sorted_times)

    # Plot ECDF with markers
    sns.lineplot(x=sorted_times, y=ecdf_values, label=algorithm, markers=True)

plt.title("Empirical Cumulative Distribution Function (ECDF) of Time Taken")
plt.xlabel("Time Taken (ms)")
plt.ylabel("Cumulative Array Sizes")
plt.legend(title="Algorithm")
plt.show()


#This code below is used in case of multiple systems to have them compared.

pc_data = pd.read_csv("your_path_here",header=None, names=["Array Type", "Array Size", "Algorithm", "Time Taken"])
laptop_data = pd.read_csv("your_path_here",header=None, names=["Array Type", "Array Size", "Algorithm", "Time Taken"])

# Add a column to distinguish between the two systems
pc_data['System'] = 'PC'
laptop_data['System'] = 'Laptop'
print(pc_data.columns)
print(laptop_data.columns)

# Concatenate both datasets into one
combined_data = pd.concat([pc_data, laptop_data])
plt.figure(figsize=(12, 6))
sns.boxplot(x='System', y='Time Taken', hue='Algorithm', data=combined_data)
plt.title('Comparison of Sorting Algorithm Performance (PC vs Laptop)')
plt.xlabel('System')
plt.ylabel('Time Taken (ms)')
plt.legend(title='Algorithm', loc='upper left')
plt.show()