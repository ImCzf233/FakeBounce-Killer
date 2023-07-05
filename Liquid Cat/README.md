<h1 align="center">
    LiquidCat
</h1>

<p align="center">
    LiquidCat is a free and open source mixin-based injection hacked client using Forge for Minecraft 1.8.9. 
</p>

<div align="center">
    Archived and Discontiuned
    <a href="https://discord.gg/asCkVB9Gj3"><img src="https://img.shields.io/discord/937649672284164126?color=%23141515&label=Discord&logo=Discord&logoColor=white&labelColor=%235865F2" alt="Discord"/></a>
    <br>
    <img src="https://img.shields.io/github/last-commit/CatsDevelopment/LiquidCat?label=Last%20commit&logo=GitHub&logoColor=white&labelColor=%231b1f23" alt="Last commit"/>
    <img src="https://img.shields.io/github/contributors/CatsDevelopment/LiquidCat?label=Contributors&logo=GitHub&logoColor=white&labelColor=%231b1f23" alt="Contributors"/>
    <br>
    <img src="https://img.shields.io/github/languages/code-size/CatsDevelopment/LiquidCat?label=Code%20size&logo=GitHub&logoColor=white&labelColor=%231b1f23" alt="Code size">
    <img src="https://img.shields.io/tokei/lines/github/CatsDevelopment/LiquidCat?label=Lines%20of%20code&logo=GitHub&logoColor=white&labelColor=%231b1f23" alt="Lines of code"/>
</div>

## Thanks to
- [CCBlueX](https://github.com/CCBlueX) for original [LiquidBounce](https://github.com/CCBlueX/LiquidBounce/tree/legacy)
- [MinecraftForge](https://github.com/MinecraftForge) for [Forge](https://github.com/MinecraftForge/MinecraftForge)

## Issues
If you notice any bugs or missing features, you can let us know by opening an issue [here](https://github.com/CatsDevelopment/LiquidCat/issues).

## Source code
You can get source code [here](https://github.com/CatsDevelopment/LiquidCat/tree/main).

## License
This project is subject to the [GNU General Public License v3.0](LICENSE). This does only apply for source code located directly in this clean repository. During the development and compilation process, additional source code may be used to which we have obtained no rights. Such code is not covered by the GPL license.

For those who are unfamiliar with the license, here is a summary of its main points. This is by no means legal advise nor legally binding.

You are allowed to
- Use
- Share
- Modify

This project entirely or partially for free and even commercially. However, please consider the following:

- **You must disclose the source code of your modified work and the source code you took from this project. This means you are not allowed to use code from this project (even partially) in a closed-source (or even obfuscated) application.**
- **Your modified application must also be licensed under the GPL** 

Do the above and share your source code with everyone; just like we do.

## Contributing

We appreciate contributions. So if you want to support us, feel free to make changes to LiquidCat's source code and submit a pull request.

If you have experience in one or more of these fields, we would highly appreciate your support.

Our main goals right now are to
- Completely rewrite the original code in [Kotlin](https://kotlinlang.org)
- Optimize the original code

## Setting up a Workspace

LiquidBounce is using Gradle, so make sure that it is installed properly. Instructions can be found on [Gradle's website](https://gradle.org/install/).
1. Clone the repository using `git clone https://github.com/CatsDevelopment/LiquidCat`. 
2. CD into the local repository folder.
3. Depending on which IDE you are using execute either of the following commands:
    - For IntelliJ: `gradlew --debug setupDevWorkspace idea genIntellijRuns build`
    - For Eclipse: `gradlew --debug setupDevWorkspace eclipse build`
4. Open the folder as a Gradle project in your IDE.
5. Select either the Forge or Vanilla run configuration.

## Additional libraries

### Mixins
Mixins can be used to modify classes at runtime before they are loaded. LiquidBounce is using it to inject its code into the Minecraft client. This way, we do not have to ship Mojangs copyrighted code. If you want to learn more about it, check out its [Documentation](https://docs.spongepowered.org/5.1.0/en/plugin/internals/mixins.html).
