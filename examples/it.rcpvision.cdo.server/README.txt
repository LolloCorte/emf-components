The following cdo-server.product VM Argument (see 'Launching' Tab)

  -Dnet4j.config=${resource_loc:/it.rcpvision.cdo.server/rootfiles/configuration}
  
is correct as far as the Product is launched from the IDE.

After the Product is Exported, before executing eclipse.exe, modify file 'eclipse.ini' 
setting parameter 'net4j.config' to value './features/cdo_1.0.0/rootfiles/configuration'

this way

  -Dnet4j.config=./features/cdo.server.feature_1.0.0/rootfiles/configuration
  