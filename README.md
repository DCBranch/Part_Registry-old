# Part_Registry - Manufacturing Part List Editor
A part list editing program made in Java and utilizing the OpenFX's Java FX libraries for the GUI. The application showcases a JavaFX/FXML based GUI with tabs and multiple windows, file writing and rewriting, line-by-line sorting, lambda expressions with streams and collection.

## Table of Contents
* [Introduction](#introduction)
* [Technologies](#technologies)
* [Possible Updates](#possible-updates)

## General Info
### Program Description
Using a from database-like system made from scratch to showcase, Part Registry utilizes text-based files and writers to enable its users to create a listing of part, add parts to the list, delete parts, view the entire sorted listing, and view filtered lists based on user-inputed search terms and part type. Every part can have a name, part number, NCAGE (5 numbers in ##### format), and an ID (13 numbers with dash seperations in ####-##-###-#### format). However, parts also fall into one of two types and both have their own unique pieces of data:
* Consumable parts: These parts are only usable a finite number of times. Each has spaces for replacement cost and the number of uses left.
* Expendable parts: These parts are used until failure. Each has spaces for failure rate, lead time, and the tools required to have the expendable part be functional.

### Design
### Methodology

## Technologies
Used to create the Part Registry:
* JDK 14.0.2
* OpenJFX 14.0.2.1
* SceneBuilder 11.0.1

## Possible Updates
Here is a list of bug fixes, changes, or new additions that may come in the future:
* 