# Welcome to RunAway app!

Hi! I'm your first Markdown file in **StackEdit**. If you want to learn about StackEdit, 
you can read me. If you want to play with Markdown, you can edit me. 
Once you have finished with me, you can create new files by opening the **file explorer** 
on the left corner of the navigation bar.

| ![screenshot1](screenshots/Screenshot_1.png) |Image2|Image3|Image4|
|----------------------------------------------|-|-|-|
| Image5                                       |Image6|Image7|Image8|

# Build with

StackEdit stores your files in your browser, which means all your files are automatically saved 
locally and are accessible **offline!**

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

You can open a file from **Google Drive**, **Dropbox** or **GitHub** by opening the **Synchronize** 
sub-menu and clicking **Open from**. Once opened in the workspace, any modification in the file will 
be automatically synced.

# Setup for personal use

Publishing in StackEdit makes it simple for you to publish online your files. Once you're happy 
with a file, you can publish it to different hosting platforms like **Blogger**, **Dropbox**, 
**Gist**, **GitHub**, **Google Drive**, **WordPress** and **Zendesk**. 
With [Handlebars templates](http://handlebarsjs.com/), you have full control over what you export.
