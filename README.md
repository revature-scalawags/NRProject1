# Project 1

## Project Description
This project uses Hive to answer questions about Federal Aerial Surveilance. The data was gathered by a plane tracking website, Flightradar24, and compiled by BuzzFeed.

## Technologies Used
* Scala - version 2.13.4
* Scala Logging - version 3.9.2
* sbt - version 1.4.4
* Apache Hive - version 3.1.2

## Features

Answers questions about Federal Aerial Surveilance.

### Question 1

Which US Federal Organization is responsible for most domestic aerial surveilance?

### Question 2

What is the average location (Lattitude, Longitude) which is surveiled?

### Question 3

Which type of aircraft is most commonly used in surveilance?

To-Do List:
* Allow for custom user queries
* Make list of most commonly surveilled states

## Getting Started

git clone https://github.com/revature-scalawags/NRProject1

Then, simply navigate to the folder which contains the build.sbt file and enter the command "sbt run" into the CLI. This will compile and execute the program.

## Usage

To start the program, navigate to the folder which contains the build.sbt file and enter the command "sbt run" into the CLI. After the program has loaded, you will be presented with several options, each representing a feature of the program. Simply follow the instructions to proceed.

## Data Description
The data used in this project is in the form of three csv files. There are over a million unique entries, in about 180 MB of data.

The data includes unique aircraft identifiers, coordinates in latitude and longitude, altitude, speed, compass bearing, aircraft model, time identified, name of the aircraft registrant, other names for the registrant, aircraft serial number as assigned by manufacturer, aircraft manufacturer, year the aircraft was manufactured, type of aircraft (helicopter, single-engine plane, multi-engine plane), and the federal agency operating the aircraft.
