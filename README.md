# Compose KMP library - Web issue reproducer

To reproduce the crash run `./gradlew build`

It will output: 

```
* What went wrong:
Could not determine the dependencies of task ':common:jsPackageJson'.
> Could not resolve all dependencies for configuration ':common:jsNpm'.
   > Could not resolve org.jetbrains.compose.foundation:foundation:1.0.0-beta3.
     Required by:
         project :common
      > No matching variant of org.jetbrains.compose.foundation:foundation:1.0.0-beta3 was found. The consumer was configured to find a usage of 'kotlin-runtime' of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'js', attribute 'org.jetbrains.kotlin.js.compiler' with value 'ir' but:
          - Variant 'debugApiElements-published' capability org.jetbrains.compose.foundation:foundation:1.0.0-beta3:
              - Incompatible because this component declares an API of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm' and the consumer needed a usage of 'kotlin-runtime' of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'js'
              - Other compatible attribute:
                  - Doesn't say anything about org.jetbrains.kotlin.js.compiler (required 'ir')
          - Variant 'debugRuntimeElements-published' capability org.jetbrains.compose.foundation:foundation:1.0.0-beta3 declares a runtime of a component:
              - Incompatible because this component declares a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm' and the consumer needed a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'js'
              - Other compatible attribute:
                  - Doesn't say anything about org.jetbrains.kotlin.js.compiler (required 'ir')
          - Variant 'desktopApiElements-published' capability org.jetbrains.compose.foundation:foundation:1.0.0-beta3:
              - Incompatible because this component declares an API of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'jvm' and the consumer needed a usage of 'kotlin-runtime' of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'js'
              - Other compatible attribute:
                  - Doesn't say anything about org.jetbrains.kotlin.js.compiler (required 'ir')
          - Variant 'desktopRuntimeElements-published' capability org.jetbrains.compose.foundation:foundation:1.0.0-beta3 declares a runtime of a component:
              - Incompatible because this component declares a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'jvm' and the consumer needed a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'js'
              - Other compatible attribute:
                  - Doesn't say anything about org.jetbrains.kotlin.js.compiler (required 'ir')
          - Variant 'metadataApiElements' capability org.jetbrains.compose.foundation:foundation:1.0.0-beta3:
              - Incompatible because this component declares a usage of 'kotlin-api' of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'common' and the consumer needed a usage of 'kotlin-runtime' of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'js'
              - Other compatible attribute:
                  - Doesn't say anything about org.jetbrains.kotlin.js.compiler (required 'ir')
          - Variant 'releaseApiElements-published' capability org.jetbrains.compose.foundation:foundation:1.0.0-beta3:
              - Incompatible because this component declares an API of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm' and the consumer needed a usage of 'kotlin-runtime' of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'js'
              - Other compatible attribute:
                  - Doesn't say anything about org.jetbrains.kotlin.js.compiler (required 'ir')
          - Variant 'releaseRuntimeElements-published' capability org.jetbrains.compose.foundation:foundation:1.0.0-beta3 declares a runtime of a component:
              - Incompatible because this component declares a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm' and the consumer needed a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'js'
              - Other compatible attribute:
                  - Doesn't say anything about org.jetbrains.kotlin.js.compiler (required 'ir')
   > Could not resolve org.jetbrains.compose.material:material:1.0.0-beta3.
     Required by:
         project :common
      > No matching variant of org.jetbrains.compose.material:material:1.0.0-beta3 was found. The consumer was configured to find a usage of 'kotlin-runtime' of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'js', attribute 'org.jetbrains.kotlin.js.compiler' with value 'ir' but:
          - Variant 'debugApiElements-published' capability org.jetbrains.compose.material:material:1.0.0-beta3:
              - Incompatible because this component declares an API of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm' and the consumer needed a usage of 'kotlin-runtime' of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'js'
              - Other compatible attribute:
                  - Doesn't say anything about org.jetbrains.kotlin.js.compiler (required 'ir')
          - Variant 'debugRuntimeElements-published' capability org.jetbrains.compose.material:material:1.0.0-beta3 declares a runtime of a component:
              - Incompatible because this component declares a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm' and the consumer needed a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'js'
              - Other compatible attribute:
                  - Doesn't say anything about org.jetbrains.kotlin.js.compiler (required 'ir')
          - Variant 'desktopApiElements-published' capability org.jetbrains.compose.material:material:1.0.0-beta3:
              - Incompatible because this component declares an API of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'jvm' and the consumer needed a usage of 'kotlin-runtime' of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'js'
              - Other compatible attribute:
                  - Doesn't say anything about org.jetbrains.kotlin.js.compiler (required 'ir')
          - Variant 'desktopRuntimeElements-published' capability org.jetbrains.compose.material:material:1.0.0-beta3 declares a runtime of a component:
              - Incompatible because this component declares a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'jvm' and the consumer needed a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'js'
              - Other compatible attribute:
                  - Doesn't say anything about org.jetbrains.kotlin.js.compiler (required 'ir')
          - Variant 'metadataApiElements' capability org.jetbrains.compose.material:material:1.0.0-beta3:
              - Incompatible because this component declares a usage of 'kotlin-api' of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'common' and the consumer needed a usage of 'kotlin-runtime' of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'js'
              - Other compatible attribute:
                  - Doesn't say anything about org.jetbrains.kotlin.js.compiler (required 'ir')
          - Variant 'releaseApiElements-published' capability org.jetbrains.compose.material:material:1.0.0-beta3:
              - Incompatible because this component declares an API of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm' and the consumer needed a usage of 'kotlin-runtime' of a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'js'
              - Other compatible attribute:
                  - Doesn't say anything about org.jetbrains.kotlin.js.compiler (required 'ir')
          - Variant 'releaseRuntimeElements-published' capability org.jetbrains.compose.material:material:1.0.0-beta3 declares a runtime of a component:
              - Incompatible because this component declares a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm' and the consumer needed a component, as well as attribute 'org.jetbrains.kotlin.platform.type' with value 'js'
              - Other compatible attribute:
                  - Doesn't say anything about org.jetbrains.kotlin.js.compiler (required 'ir')
```