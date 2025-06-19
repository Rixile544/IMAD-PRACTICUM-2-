# IMAD PRACTICUM
Music Playlist Manager App
Created by: Rixile Ndlovu
Date: June 2025
Institution: Rosebank College
Language/Framework: Kotlin (Android Studio)

Project Description
This is a native Android app developed in Kotlin that allows users to build and view a music playlist of up to 4 songs. It uses parallel arrays, screen navigation, loops, and error handling. The app calculates the average song rating, displays all playlist data, and prevents invalid user input — making it user-friendly and reliable.

Features
Add a new song with:

Song title

Artist name

Rating (1–5)

Comment

View full playlist with all song details

Automatically calculate average rating using a loop

Screen navigation between main and detailed view

Error handling for:

Empty fields

Ratings outside 1–5 range

More than 4 songs

Responsive layout for mobile screens

Screenshots

Main Screen: 
![main screen](https://github.com/user-attachments/assets/82c657c5-ae01-4b49-89f9-07df7a8d9ebc)


Detailed View: 
![details screen](https://github.com/user-attachments/assets/7062283b-b604-439a-8494-4ea76ffebc11)


Input Example:
![E G](https://github.com/user-attachments/assets/6023d02a-85ea-41a4-b4ed-17b2ea519bfe)


Sample Playlist
Song Title	Artist Name	Rating (1–5)	Comment
Money	Cardi B	4	Rap
Work	Rihanna	1	Dance song
Bonnie and Clyde	Tink	2	Best love song
Her Heart	Anthony Hamilton	3	Memories

How the App Works
User enters song details and taps "Add to Playlist"

App validates all fields and rating input

"View Playlist" displays a scrollable list of songs with all info

A loop calculates and shows the average rating

User can go back to main screen or exit the app

Technologies Used
Kotlin

Android Studio

XML for layout design

Intents for screen navigation

ArrayLists for data storage

Toast messages for user feedback

Android Emulator for testing

Challenges Faced
App crashing due to ClassNotFoundException — fixed by matching package names and cleaning the build

Calculating average rating using a loop — handled empty arrays to avoid divide-by-zero errors

Handling input layout on small screens — implemented scrollable layout

GitHub Repository
[Insert your GitHub repo link here once uploaded]

Acknowledgements
This app was created for a Mobile Application Development assignment at Rosebank College. Thanks to the official Kotlin and Android documentation for guidance during development.

References
Kotlin Documentation

Android Developers Guide

