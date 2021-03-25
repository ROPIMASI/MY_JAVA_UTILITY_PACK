# MY JAVA UTILITY PACK
My personal Java library of small tools for general purpose.  
&nbsp;  
&nbsp;  

## Table of contents
* [Description](#description)
* [@javadoc](#javadoc)
* [RIGHTS, LICENSE AND DISCLAIMER](#rights)
* [DIREITOS, LICENSA E ISENÇÃO DE RESPONSABILIDADE](#direitos)
* [Versions](#versions)
  + [Versioning](#versioning)
  + [Current Version](#current)
  + [Changelog & Previous Versions](#changelog)
  + [Roadmap & Future Versions](#roadmap)
&nbsp;  
&nbsp;  
&nbsp;  

<a name="description"></a>
## Description
* SUBJECT:        Java library of small tools for general purpose;
* PROJECT NAME:   My Java Utility Pack;
* LIBRARY NAME:   MyUtility.
&nbsp;  
&nbsp;  
&nbsp;  

<a name="javadoc"></a>
## @javadoc
@author         Ronaldo Marques;  
@since          20190501;  
@last_change    20210325;  
@version        0.4.0-beta;  
@category       JavaClassLib;  
@language       JAVA-11;  
@dev_environmet Microsoft-Windows-10, REDHAT-OPEN-JDK-11.0.9, Eclipse-IDE-Enterprise-Java-Developers-v2020-03.  
&nbsp;  
&nbsp;  
&nbsp;  

<a name="rights"></a>
## RIGHTS, LICENSE AND DISCLAIMER:
This file is an integral, indivisible, inseparable part of a particular project, which has its use expressly exclusive to its author, Ronaldo Marques (ronaldomarques@email.com / http://ronaldomarques.dev);  
Any use, sale, rental, distribution, in parts or integral of this project is prohibited;  
This project has the sole purpose of demonstrating knowledge and skills in software development;  
Therefore, the author of this project does not recognize or assume any responsibility for the use of it, neither for any possible reflexes or consequence of such use.  
<a name="direitos"></a>
## DIREITOS, LICENSA E ISENÇÃO DE RESPONSABILIDADE:
Este arquivo é parte integrante, indivisível, inseparável de um projeto particular, o qual tem seu uso e fruto expressamente exclusivo à seu autor, Ronaldo Marques (ronaldomarques@email.com / http://ronaldomarques.dev);  
É vetado qualquer utilização, venda, aluguél, distribuição, em partes ou integral deste projeto;  
Este projeto tem finalidade exclusiva de demonstração de conhecimento e habilidades no desenvolvimento de software;  
Sendo assim, o autor deste projeto não reconhece nem assume qualquer responsabilidade pela utilização do mesmo, tão pouco por qualquer possível reflexos ou consequência de tal utilização.  
&nbsp;  
&nbsp;  
&nbsp;  

<a name="versions"></a>
## Versions
<a name="versioning"></a>
### Versioning
In a team project, it is very important to know and follow the specifications of the project version. Although at the moment MyUtility's status is under early development (as it has not its first release version yet 1.0.0-release) its project already is designed under [**_SemVer_** (Semantic Versioning Specification)](http://semver.org/).  
Thus, MyUtility uses **_SemVer_** for its versioning. **_SemVer_** is a specification (set of rules) that tells (or dictates) us how to use the numbers (and some letters) on the _versioning-expression_ (_VerExpr_). More specifically, MyUtility uses the following standardization: **_Major.Minor.Patch-ReleaseStatus+Build_**, where:
* The standard values of **_Major_**, **_Minor_**, and **_Patch_** for the _VerExpr_ are as follows:
  + **_Positive_** integer decimal numbers, without zero remaining on the left;
  + **_Major_** version represents wider changes in the project, which affects the main structure of the project, or its main objectives, or the last user API released;
  + **_Minor_** version represents smaller changes in the project, which don't affect above itens, but affect the amount of the application fuatrures with a new one or more, or remove an existing feature previouslly released;
  + **_Patch_** version represents specific changes which goals to fix or improve some feature, or undesired behavior in the application.  
* The standard flags of **_ReleaseStatus_** for the _VerExpr_ are as follows:
  + **_dev_**: in early development, usage not encouraged;
  + **_alpha_**: in development, first test phase, it's encouraged usage for **test only** by people involved with software development, at self-own risk;
  + **_beta_**: in pre-release version, general public usage is acceptable, however, **only for test**, usage is a choice at self-own risk;
  + **_release_**: release version; relatively stable in proportion to the effectiveness of the tests; bugs are possible to appear, so it would come back to a _hotfix-branch_ if needed.
* The standard values of **_Build_** for the _VerExpr_ are as follows:
  + A 12-digit numeric sequence, positive integer decimal digits, formatted somewhat similar to PostgreSQL DateTime YYYYMMDDhhmm;
  + The initial 4 digits (YYYY) represent the year;
  + The next 2 digits (MM) represent the month;
  + The next 2 digits (DD) represent the day;
  + The next 2 digits (hh) represent the hour;
  + The following 2 digits (mm) represent the minutes;
  + All referring to the moment when the developer builds/exports the .JAR library. (* 1)  
  
> Example: "202103250231"  
  
> (* 1) The numerical sequence _Build_ necessarily refers to Greenwich Mean Time (GMT), also known as Coordinated Universal Time (UTC), or "Z time" or "Zulu time".  
&nbsp;  

<a name="current"></a>
### Current Version 0.4.0-beta
* Feature 1: Self-presentation about its project name, library name, vesion;
* Feature 2: If-True-Print-Debug calling the method `.pd("arg_message");` whether a boolean variable of control, `boolean itpd`, is true, so the method prints on console the line '[DEBUG -=> _arg_message_]' where _arg_message_ is a `String` typed argument passed by the user, otherwise the method does nothing;
&nbsp;  

<a name="changelog"></a>
### Changelog Previous Versions
###### 0.1.0 has no historic;
###### 0.2.0 has no historic;
###### 0.3.0 has no historic;
&nbsp;  

<a name="roadmap"></a>
### Roadmap Future Versions
##### 0.5.0-beta
* Feature 3: Provides one type of wrapper for `java.util.Scanner` object and 4 methods for scanning `int` typed entries and scanning `String` typed entries, both capable of scanning by reading the first character block or entire line optionally;
* Feature 4: ...;
&nbsp;  
##### 0.6.0-beta
* Feature 5: _Feature-1_ refactored, now with basic resouces list;
* Feature x: ...;
&nbsp;  
##### 0.7.0-beta
* Feature y: ...;
&nbsp;  
##### 1.0.0-release
* Feature z: ...;
&nbsp;  
&nbsp;  
&nbsp;  

## Att. Ronaldo Marques.
###### | https://ronaldomarques.dev | [linkedin @ronaldo marques](https://linkedin.com/in/ropimasi/) | [twitter @ropimasi](https://twitter.com/ropimasi/) | [insta @ropimasi](https://instagram.com/ropimasi/) | ronaldomarques@email.com |  
&nbsp;  
