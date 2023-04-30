# Hectus Client

This is an close-source project.  
If you have access to this project, you're probably a translator.

## Translating

### Starting

To start, take a look into the `src/main/resources/assets/hectusclient/lang` and search for your language file.  
There you can edit the `.json` files. Please only translate your languages.  

### How to Translate

To translate, just edit the values.  
Example:

```json
{
    "hectusclient.client_menu.gui.title": "",
    "hectusclient.client_menu.gui.section.util.title": ""
}
```

If you would translate to english, you would edit it to this:

```json
{
    "hectusclient.client_menu.gui.title": "Client Menu",
    "hectusclient.client_menu.gui.section.util.title": "Util Mods"
}
```

Then just save it and commit it.  

Definitions: `"key": "value"`.  
Do not edit the keys, as they are the "identifiers" for the translations. They are required for Minecraft to even find the translation.  
Only edit the values, they are the translation and can contain everything: `a-z`, `A-Z`, `0-9`, `etc.`
