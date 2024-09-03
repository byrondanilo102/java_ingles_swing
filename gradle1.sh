#!/bin/bash

opcion=0
linea=""

gradle_cmd="./gradlew" #"./gradlew" "gradle"
artifact_id="ingles_desktop_all"

path="";
archivo=""
variable=""

paquete="com.bydan"
artifact_type="webapp"
con_interactivo="false"


get_menu_opciones() {
    clear

    echo -e "\n\t\t----------- GRADLE -------------\n"
    
    echo -e "\t\t1. Crear Proyecto (${gradle_cmd} init)"
    echo -e "\t\t2. Validar Proyecto (${gradle_cmd} check)"
    echo -e "\t\t3. Build Proyecto (${gradle_cmd} build)"
    echo -e "\t\t4. Testear Proyecto (${gradle_cmd} test)"
    echo -e "\t\t5. Exportar Jar (${gradle_cmd} assemble)"
    echo -e "\t\t6. Ejecutar Proyecto (${gradle_cmd} run)"
    echo -e "\t\t7. Limpiar Compilados y Jar (${gradle_cmd} clean)"

    echo -e "\n\t\t----------- ECLIPSE -------------\n" 
    echo -e "\t\t8. Eclipse Files (${gradle_cmd} eclipse)"
    echo -e "\t\t9. Limpiar Eclipse Files (${gradle_cmd} cleanEclipse)"

    echo -e "\n\t\t----------- INSTALL -------------\n"
    echo -e "\t\t10. Install/Upgrade/Remove Packages (gradle build)"
    echo -e "\t\t11. Instalar Proyecto (${gradle_cmd} assembleDist)"
    echo -e "\t\t12. Deploy Proyecto (${gradle_cmd} installDist)"
    echo -e "\t\t13. Exportar Tar Proyecto (${gradle_cmd} distTar)"
    echo -e "\t\t14. Exportar Zip Proyecto (${gradle_cmd} distZip)"

    echo -e "\t\t15. Verificar Proyecto (${gradle_cmd} check)"

    echo -e "\n\t\t----------- MOSTRAR -------------\n" 
    echo -e "\t\t31. Mostrar Paquetes (${gradle_cmd} list)"
    echo -e "\t\t32. Informacion Paquete (${gradle_cmd} view log4)"
    echo -e "\t\t33. Buscar Paquetes (${gradle_cmd} search)"

    echo -e "\n\t\t----------- EXTRA -------------\n" 
    echo -e "\t\t41. Wrapper Files (${gradle_cmd} wrapper)"
    echo -e "\t\t42. Docs Files (${gradle_cmd} javadoc)"

    echo -e "\n\t\t----------- CONFIGURACION -------------\n" 
    echo -e "\t\t81. Instalar Gradle (install ${gradle_cmd})"
    echo -e "\t\t82. Mostrar version Gradle (${gradle_cmd} -v)"
    echo -e "\t\t83. Error/Actualizar version Gradlew (${gradle_cmd} wrapper --gradle-version)"

    echo -e "\n\t\t----------- HELP -------------\n" 
    echo -e "\t\t98. Lista Comandos Ayuda Gradle (${gradle_cmd} tasks)"
    echo -e "\t\t99. Help Gradle (${gradle_cmd} help)"

    echo -e "\n\t\t0. Salir\n\n"

    read -p "Escoja una Opcion: " opcion
}

exec_create_project() {
    clear	
    echo -e "----------- 1. Crear Proyecto (gradle init) -------------\n"

    mkdir ${artifact_id}

    cd ${artifact_id}

	${gradle_cmd} init
    
    cd ..

    #SKELETON
    #simple1-app
    #	pom.xml
    #	src/main/java
    #		com/bydan/proyecto1/App.java
    #	src/test/java
    #		com/bydan/proyecto1/AppTest.java
}

exec_validate_project() {
    clear	
    echo -e "----------- 2. Validar Proyecto (gradle check) -------------\n"
		
    cd ${artifact_id}
    ${gradle_cmd} check 
    cd ..
}

exec_build_project() {
    clear	
    echo -e "----------- 3. Build Proyecto (gradle build) -------------\n"
		
    cd ${artifact_id}
    ${gradle_cmd} build 
    cd ..
}

exec_test_project() {
    clear	
    echo -e "----------- 4. Testear Proyecto (gradle test) -------------\n"
		
    cd ${artifact_id}
    ${gradle_cmd} test 
    cd ..            
}

exec_export_jar() {
    clear	
    echo -e "----------- 5. Exportar Jar (gradle assemble) -------------\n"
	            
    cd ${artifact_id}
    ${gradle_cmd} assemble
    cd ..
}

exec_execute_jar() {
    clear	
    echo -e "----------- 6. Ejecutar Proyecto (${gradle_cmd} run) -------------\n"
	             
    cd ${artifact_id}
    ${gradle_cmd} run
    #java -cp ${artifact_id}-1.0.jar $paquete.presentation.desktop.jframes.PrincipalJFrame 
    cd ..
}

exec_clean_project() {
    clear	
    echo -e "----------- 7. Limpiar Compilados y Jar (${gradle_cmd} clean) -------------\n"
	
    cd ${artifact_id}
    ${gradle_cmd} clean 
    cd ..         
}

exec_eclipse() {
    clear	
    echo -e "----------- 8. Eclipse Files (gradle cleanEclipse) -------------\n"
	#java -cp target/tesis_desktop_all-1.0.jar com.bydan.framework.tesis.presentation.desktop.jframes.PrincipalJFrame

    cd ${artifact_id}
    ${gradle_cmd} eclipse
    cd ..         
}

exec_eclipse_clean() {
    clear	
    echo -e "----------- 9. Limpiar Eclipse Files (gradle cleanEclipse) -------------\n"
	#java -cp target/tesis_desktop_all-1.0.jar com.bydan.framework.tesis.presentation.desktop.jframes.PrincipalJFrame

    cd ${artifact_id}
    ${gradle_cmd} cleanEclipse
    cd ..         
}

exec_install_packages() {
    clear	
    echo -e "----------- 10. Install/Upgrade/Remove Packages (gradle build) -------------\n"
	
    cd ${artifact_id}
    ${gradle_cmd} build 
    cd ..       
}

exec_install_project() {
    clear	
    echo -e "----------- 11. Instalar Proyecto (gradle assembleDist) -------------\n"
	
    cd ${artifact_id}
    ${gradle_cmd} assembleDist 
    cd ..       
}

exec_deploy_project() {
    clear	
    echo -e "----------- 12. Deploy Proyecto (gradle installDist) -------------\n"
	
    cd ${artifact_id}
    ${gradle_cmd} installDist 
    cd ..          
}

exec_export_tar_project() {
    clear	
    echo -e "----------- 13. Exportar Tar Proyecto (${gradle_cmd} distTar) -------------\n"
	
    cd ${artifact_id}
    ${gradle_cmd} distTar 
    cd ..         
}

exec_export_zip_project() {
    clear	
    echo -e "----------- 14. Exportar Zip Proyecto (${gradle_cmd} distZip) -------------\n"
	
    cd ${artifact_id}
    ${gradle_cmd} distZip 
    cd ..         
}

exec_verify_project() {
    clear	
    echo -e "----------- 15. Verificar Proyecto (gradle check) -------------\n"
	
    cd ${artifact_id}
    ${gradle_cmd} check 
    cd ..         
}

exec_show_packages() {
	clear	
    echo -e "----------- 31. Mostrar Paquetes (gradle show) -------------"
    echo
    
    cd ${artifact_id}

    echo -e "----------- Paquetes Implementation-------------"
    ${gradle_cmd} dependencies -b ./app/build.gradle --configuration=implementation

    echo -e "----------- Paquetes Test Implementation-------------"
    ${gradle_cmd} dependencies -b ./app/build.gradle --configuration=testImplementation   

    cd ..

    # echo -e "----------- Paquetes Globales -------------"
    # ${gradle_cmd} list -g
}

exec_info_package() {
	clear	
    echo -e "----------- 32. Informacion Paquete (gradle view log4) -------------"
    echo
    
    read -p "Ingrese paquete (log4,pdf,excel,etc): " package_name

    cd ${artifact_id}
    /usr/bin/google-chrome-stable %U "https://mvnrepository.com/search?q=${package_name}"
    # ${gradle_cmd} view ${package_name}
    cd ..
}

exec_search_packages() {
	clear	
    echo -e "----------- 33. Buscar Paquetes (gradle search) -------------"
    echo
    
    read -p "Ingrese paquete (log4,pdf,excel,etc): " package_name

    cd ${artifact_id}
    
    #${gradle_cmd} search ${package_name}

    /usr/bin/google-chrome-stable %U "https://mvnrepository.com/search?q=${package_name}"

    cd ..

    # URL: https://mvnrepository.com/repos/central
}

exec_wrapper_gradle() {
    clear	
    echo -e "----------- 41. Wrapper Files (${gradle_cmd} wrapper) -------------\n"
		
    cd ${artifact_id}
    ${gradle_cmd} wrapper 
    cd ..
}

exec_javadoc_gradle() {
    clear	
    echo -e "----------- 42. Docs Files (${gradle_cmd} javadoc) -------------\n"
		
    cd ${artifact_id}
    ${gradle_cmd} javadoc 
    cd ..
}

exec_install_gradle() {
    clear
    echo -e "----------- 81. Instalar Gradle (install gradle) -------------\n"
    
     #---------------- 1.- Download --------------  
    # curl https://gradle.org/next-steps/?version=7.6.3&format=bin --output gradle-7.6-bin.zip
    # https://gradle.org/releases/

    #---------------- 2.- Unzip --------------
    # mkdir /opt/gradle
    # unzip -d /opt/gradle gradle-8.4-bin.zip
    # ls /opt/gradle/gradle-8.4

    #---------------- 3.- Configuration --------------
    # export PATH=$PATH:/opt/gradle/gradle-8.4/bin

    #---------------- 4.- Verify --------------
    ${gradle_cmd} -v

    # sudo apt install gradle
	# sudo pacman -S gradle    
}

get_version_gradle() {
    clear
    echo -e "----------- 82. Mostrar version Gradle (gradle -v) -------------\n"

    cd ${artifact_id}
    ${gradle_cmd} -v
    cd ..
}

exec_upgrade_gradlew() {
    clear
    echo -e "----------- 83. Error/Actualizar version Gradlew (./gradlew wrapper --gradle-version) -------------\n"

    #----- 1.- Configuracion Actualizar Gradle ----- 

    # Path: ./gradle/wrapper
    # File: gradle-wrapper.properties
    # Value: distributionUrl=https\://services.gradle.org/distributions/gradle-7.5.1-bin.zip
    # Error: Cuidado con caracteres especiales (Copiar Base)

    #----- 2.- Comando Actualizar Gradle ----- 

    #${gradle_cmd} wrapper --gradle-version 7.5.1

    #----- 3.- Verificar Gradle ----- 
    
    cd ${artifact_id}
    ${gradle_cmd} -v
    cd ..
}

get_list_commands_help_gradle() {
	clear	
    echo -e "----------- 98. Lista Comandos Ayuda Gradle (gradle tasks) -------------"
    echo
    
    cd ${artifact_id}
    ${gradle_cmd} tasks
    cd ..
}

get_help_gradle() {
    clear
    echo -e "----------- 99. Help Gradle (${gradle_cmd} help) -------------\n"

    cd ${artifact_id}

    echo -e "\n\t---------------------- HELP 1 ------------------------\n"
    ${gradle_cmd} help

    echo -e "\n\t---------------------- HELP 2 ------------------------\n"
    ${gradle_cmd} --help

    cd ..
}

while [ 1 ]
do

    get_menu_opciones

    case $opcion in

        0)  clear;
            echo -e "Proceso terminado correctamente..."
            break ;;         

	    1)  exec_create_project     ;;                  
        2)  exec_validate_project   ;;   
        3)  exec_build_project    ;;  
        4)  exec_test_project   ;;
        5)  exec_export_jar     ;;  
        6)  exec_execute_jar    ;;                      
        7)  exec_clean_project  ;;

        8)  exec_eclipse  ;;
        9)  exec_eclipse_clean  ;;

        10) exec_install_packages    ;;
        11) exec_install_project    ;;
        12) exec_deploy_project ;;
        13) exec_export_tar_project ;;
        14) exec_export_zip_project ;;
        15) exec_verify_project ;;

        31) exec_show_packages ;;
        32) exec_info_package ;;
        33) exec_search_packages ;;  

        41) exec_wrapper_gradle ;;
        42) exec_javadoc_gradle ;;

        81) exec_install_gradle ;;
        82) get_version_gradle  ;;
        83) exec_upgrade_gradlew ;;           

        98) get_list_commands_help_gradle ;;
        99) get_help_gradle ;;

        *)  echo -e "Seleccion Incorrecta";;
    esac

echo -e "\nPresione la tecla Enter para continuar"

read linea

done