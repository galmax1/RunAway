# Welcome to RunAway app!

Hi! I'm your first Markdown file in **StackEdit**. If you want to learn about StackEdit, 
you can read me. If you want to play with Markdown, you can edit me. 
Once you have finished with me, you can create new files by opening the **file explorer** 
on the left corner of the navigation bar.

| ![screenshot1](screenshots/Screenshot_1.png) | ![screenshot2](screenshots/Screenshot_2.png) | ![screenshot3](screenshots/Screenshot_3.png) | ![screenshot4](screenshots/Screenshot_4.png) |
|----------------------------------------------|----------------------------------------------|----------------------------------------------|----------------------------------------------|
| ![screenshot6](screenshots/Screenshot_6.png) | ![screenshot7](screenshots/Screenshot_7.png) | ![screenshot8](screenshots/Screenshot_8.png) | ![screenshot9](screenshots/Screenshot_9.png) | 

# Build with

| Technology                                                                                     | Description                                                                                       | Version |
|------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------|---------|
| ![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-4285F4?style=for-the-badge&logo=android&logoColor=white) | **Jetpack Compose** - Modern toolkit for building native Android UIs using declarative components | Bom 2024.02.02  |
| ![Kotlin Coroutines](https://img.shields.io/badge/Kotlin%20Coroutines-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white) | **Kotlin Coroutines** - Asynchronous programming framework for managing background tasks          | 1.8.0   |
| ![Flow](https://img.shields.io/badge/Kotlin%20Flow-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white) | **Flow** - Kotlin's reactive streams API for handling data streams and asynchronous operations    | 1.8.0   |
| ![Jetpack Room](https://img.shields.io/badge/Jetpack%20Room-4285F4?style=for-the-badge&logo=android&logoColor=white) | **Jetpack Room** - Persistence library for local storage using SQLite                             | 2.6.1   |
| ![Jetpack Compose Navigation](https://img.shields.io/badge/Jetpack%20Compose%20Navigation-4285F4?style=for-the-badge&logo=android&logoColor=white) | **Navigation Compose** - Navigation library for managing UI navigation in Compose apps            | 2.7.7   |
| ![Koin](https://img.shields.io/badge/Koin-FFD700?style=for-the-badge&logo=kotlin&logoColor=white) | **Koin** - Lightweight dependency injection framework for Kotlin                                  | 3.5.3   |
| ![Ktor](https://img.shields.io/badge/Ktor-0095D5?style=for-the-badge&logo=ktor&logoColor=white) | **Ktor** - Framework for building asynchronous servers and clients in Kotlin                      | 2.3.8   |

> These technologies were selected to ensure efficient, scalable, and modern Android app development.

# Module Graph
```mermaid
%%{
  init: {
    'theme': 'neutral'
  }
}%%

graph LR
  subgraph :analytics
    :analytics:presentation["presentation"]
    :analytics:domain["domain"]
    :analytics:analytics_feature["analytics_feature"]
    :analytics:data["data"]
  end
  subgraph :auth
    :auth:domain["domain"]
    :auth:data["data"]
    :auth:presentation["presentation"]
  end
  subgraph :core
    :core:domain["domain"]
    :core:database["database"]
    :core:data["data"]
  end
  subgraph :core:presentation
    :core:presentation:ui["ui"]
    :core:presentation:designsystem["designsystem"]
  end
  subgraph :run
    :run:domain["domain"]
    :run:data["data"]
    :run:network["network"]
    :run:presentation["presentation"]
    :run:location["location"]
  end
  :run:domain --> :core:domain
  :run:data --> :core:domain
  :run:data --> :core:database
  :run:data --> :run:domain
  :core:database --> :core:domain
  :auth:domain --> :core:domain
  :analytics:presentation --> :core:presentation:ui
  :analytics:presentation --> :core:presentation:designsystem
  :analytics:presentation --> :analytics:domain
  :run:network --> :core:domain
  :run:network --> :core:data
  :core:presentation:ui --> :core:domain
  :core:presentation:ui --> :core:presentation:designsystem
  :auth:data --> :auth:domain
  :auth:data --> :core:domain
  :auth:data --> :core:data
  :app --> :analytics:analytics_feature
  :app --> :core:presentation:designsystem
  :app --> :core:presentation:ui
  :app --> :core:domain
  :app --> :core:data
  :app --> :core:database
  :app --> :auth:presentation
  :app --> :auth:domain
  :app --> :auth:data
  :app --> :run:presentation
  :app --> :run:domain
  :app --> :run:data
  :app --> :run:location
  :app --> :run:network
  :auth:presentation --> :core:presentation:ui
  :auth:presentation --> :core:presentation:designsystem
  :auth:presentation --> :core:domain
  :auth:presentation --> :auth:domain
  :run:location --> :core:domain
  :run:location --> :run:domain
  :core:data --> :core:domain
  :core:data --> :core:database
  :analytics:data --> :core:database
  :analytics:data --> :core:domain
  :analytics:data --> :analytics:domain
  :analytics:analytics_feature --> :analytics:presentation
  :analytics:analytics_feature --> :core:presentation:ui
  :analytics:analytics_feature --> :core:presentation:designsystem
  :analytics:analytics_feature --> :app
  :analytics:analytics_feature --> :analytics:domain
  :analytics:analytics_feature --> :analytics:data
  :analytics:analytics_feature --> :core:database
  :run:presentation --> :core:presentation:ui
  :run:presentation --> :core:presentation:designsystem
  :run:presentation --> :core:domain
  :run:presentation --> :run:domain
```

## Analytics module

This dynamic feature module provides analytics on the total number of runs within the app. 
By using on-demand delivery, it allows users to download and access this feature only when necessary, 
optimizing app size and performance. The module efficiently tracks and analyzes run data, 
offering insights without impacting the core app’s functionality.

# Setup for personal use

To build the project, follow these steps:

1. **Open the Project in Android Studio:**
    - Launch Android Studio.
    - Click on `File > Open...` and select the root directory of your project.

2. **Sync Gradle:**
    - Android Studio will automatically detect the Gradle files and sync the project. If not, you
      can manually sync by clicking on `Sync Project with Gradle Files` in the toolbar.

3. **Add required data:**
    - To successfully build the project you need to specify your own **backend server API key** 
      and **Google Maps Api** in the local configuration file `local.properties`:
   ```bash
   API_KEY = [Replace with your own API key]
   MAPS_API_KEY = [Replace with your own API key]

4. **Build the Project:**
    - You can build the project by selecting `Build > Make Project` or by clicking the `Build` icon
      in the toolbar.


