# About
This mod patches out what I consider to be annoyances in owo-lib such as [advertisements in logs](https://github.com/wisp-forest/owo-lib/blob/1.20/src/main/java/io/wispforest/owo/util/Wisdom.java#L22) and [messing with REI UIs when "froge" is written](https://github.com/wisp-forest/owo-lib/blob/1.20/src/main/java/io/wispforest/owo/compat/rei/OwoReiPlugin.java#L139).

## Why?
Because I (and other people) have found advertising other mods in peoples' logs and the potentially seizure-inducing REI GUI easter egg to be annoying. There's also the poor conduct on the Wisp Forest devs' part largely in [Issue #174](https://web.archive.org/web/20231003000254/https://github.com/wisp-forest/owo-lib/issues/174) (and [its accompanying PR](https://web.archive.org/web/20231003064953/https://github.com/wisp-forest/owo-lib/pull/175/files)) and somewhat in [Issue #142](https://web.archive.org/web/20231003000552/https://github.com/wisp-forest/owo-lib/issues/142)

## Log adverts
This should no longer show up in your minecraft logs. (Yes, [jello](https://modrinth.com/mod/jello) is a mod)
![no more log adverts](https://github.com/woodiertexas/owolib-annoyance-remover/assets/17211100/6fa69797-92dc-4c9d-a403-318a2f0032e6)


## REI "easter egg" animation
Now, if you enter `froge` into the REI searchbar, this animation no longer happens and your logs are no longer spammed with the following errors
```
[23:44:21] [Render thread/INFO]: OpenGL debug message: id=1000, source=API, type=ERROR, severity=HIGH, message='glScissor has generated an error (GL_INVALID_VALUE)'
```
```
[19:07:17] [Render thread/INFO]: OpenGL debug message: id=1281, source=API, type=ERROR, severity=HIGH, message='GL_INVALID_VALUE error generated. Width and height must not be negative.'
```
[no more annoying owolib animation](https://github.com/woodiertexas/owolib-annoyance-remover/assets/17211100/9d2bd159-8658-45b2-9af9-3490a43021e5)
