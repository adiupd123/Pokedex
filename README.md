# Pokedex
<p align="center">
  <img src="https://user-images.githubusercontent.com/78906777/215390794-60841f42-e612-4a94-a45a-3ceb82f22e1d.png" width="200" alt="Image 1" style="padding-right:20px;" />
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <img src="https://user-images.githubusercontent.com/78906777/215390866-e71cf3c9-b3e7-4649-9570-d2a21763cd70.png" width="200" alt="Image 2" style="padding-right:20px;" />
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <img src="https://user-images.githubusercontent.com/78906777/215390887-c84b31e2-be57-45a0-8d5b-20fb315d0447.png" width="200" alt="Image 3" />
</p>

## Features

* A Pokemon-themed app which displays pokemon in a scrollable list
* It uses <b>PokeApi</b> to fetch data using Retrofit
* Implemented <b>pagination</b> and powerful <b>search</b> functionality.
* Clickable items show pokemon’s stats includes: pokemon’s photo, type and feature

## Technologies

<p>
<img src="https://user-images.githubusercontent.com/78906777/215395311-874201ba-da6d-4b91-a14f-5dd58a4f200f.png" width="225" height="100" alt="kotlin" />
<img src="https://user-images.githubusercontent.com/78906777/215394528-2fd5d861-909b-42a9-995c-c346388fc30e.png" width="300" height="100" alt="compose" />
<img src="https://user-images.githubusercontent.com/78906777/215393026-920cef2c-6d5c-4b66-8cea-bcc9c7827ee5.png" width="225" alt="pokeapi"/>
</p>

Pokedex demonstrates modern Android development using Jetpack Compose with Hilt, ViewModels based on MVVM architecture.

## Architecture

Pokedex was built with MVVM Architecture. MVVM (Model-View-ViewModel) is an architectural pattern used in Android development to separate the user interface logic from the business logic. The main components of MVVM are:
1. Model: Represents the data and business logic of the application.
2. View: The user interface that displays the data from the model.
3. ViewModel: A bridge between the Model and the View that prepares the data to be displayed in the View. The ViewModel also handles UI-related tasks such as data validation and error handling.

## Requirements

*   [Android Studio](https://developer.android.com/studio) (installed on a Linux, Mac or Windows machine)

*   Android device in
    [developer mode](https://developer.android.com/studio/debug/dev-options)
    with USB debugging enabled

*   USB cable (to connect Android device to your computer)

## Build and run

### Step 1. Clone App source code

Clone the GitHub repository to your computer to get the
application.

```
https://https://github.com/adiupd123/Pokedex
```

Open the App's source code in Android Studio. To do this, open Android
Studio and select `Open an existing project`, going to the folder containing the Project folder

### Step 2. Build the Android Studio project

Select `Build -> Make Project` and check that the project builds successfully.
You will need Android SDK configured in the settings. You'll need at least SDK
version 23. The `build.gradle` file will prompt you to download any missing
libraries.

### Step 3. Install and run the app

Connect the Android device to the computer and be sure to approve any ADB
permission prompts that appear on your phone. Select `Run -> Run app.` Select
the deployment target in the connected devices to the device on which the app
will be installed. This will install the app on the device.

