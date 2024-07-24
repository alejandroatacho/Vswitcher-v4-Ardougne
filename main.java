Widget levelUpDialog = client.getWidget(WidgetInfo.LEVEL_UP_LEVEL);
		if (levelUpDialog != null)
		{
v.invoke("Continue","",0,30,-1,15269891,false);
		} 
Widget dialogSpriteWidget = client.getWidget(WidgetInfo.DIALOG_SPRITE);
		if (dialogSpriteWidget != null)
		{
v.invoke("Continue","",1,57,2,12648448,false);
		}
if (client.getEnergy() >= 20) {
        v.getWalking().turnRunningOn();
    }
    if (v.getGroundItem().findNearestRandomized(4, 1, 11849) != null) {
        v.getGroundItem().take(11849);
    } else {
        WorldPoint currentPoint = client.getLocalPlayer().getWorldLocation();
        if (v.getWalking().nearEntity(Entity.DECORATIVE, 15608, 30)) {
            DecorativeObject decorativeObject = (new DecorativeObjectQuery()).idEquals(new int[]{15608}).result(client).nearestTo(client.getLocalPlayer());
            if (decorativeObject != null) {
                WorldPoint decorWorldPoint = WorldPoint.fromLocal(client, decorativeObject.getX(), decorativeObject.getY(), decorativeObject.getPlane());
                int decorSceneX = decorWorldPoint.getX() - client.getBaseX();
                int decorSceneY = decorWorldPoint.getY() - client.getBaseY();
                v.invoke("Climb-up", "<col=ffff>Wooden Beams", 15608, 3, decorSceneX, decorSceneY, false);
            }
        } else if (v.getWalking().nearX(2671, 1)) {
            GameObject gameObject = v.getGameObject().findNearest(15609);
            if (gameObject != null) {
                int gameObjectSceneX = gameObject.getSceneMinLocation().getX();
                int gameObjectSceneY = gameObject.getSceneMinLocation().getY();
                v.invoke("Jump", "<col=ffff>Gap", 15609, 3, gameObjectSceneX, gameObjectSceneY, false);
            }
            // Mark of Grace Location
                    } else if (v.getWalking().nearX(2727, 1)) {
            GameObject gameObject = v.getGameObject().findNearest(14928);
            if (gameObject != null) {
                int gameObjectSceneX = gameObject.getSceneMinLocation().getX();
                int gameObjectSceneY = gameObject.getSceneMinLocation().getY();
                v.invoke("Jump", "<col=ffff>Gap", 14928, 3, gameObjectSceneX, gameObjectSceneY, false);
            }
            //GroundObject Command vvv
        } else if (v.getWalking().nearY(3318, 0) && v.getWalking().nearX(2665, 1)) {
        GroundObject groundObject = (new GroundObjectQuery()).idEquals(new int[]{26635}).result(client).nearestTo(client.getLocalPlayer());
        if (groundObject != null) {
            WorldPoint groundWorldPoint = WorldPoint.fromLocal(client, groundObject.getX(), groundObject.getY(), groundObject.getPlane());
            int groundSceneX = groundWorldPoint.getX() - client.getBaseX();
            int groundSceneY = groundWorldPoint.getY() - client.getBaseY();
            v.invoke("Walk-on", "<col=ffff>Plank", 26635, 3, groundSceneX, groundSceneY, false);
        }
        } else if (v.getWalking().nearX(2656, 0) && v.getWalking().nearY(3318, 0)) {
            GameObject gameObject = v.getGameObject().findNearest(15610);
            if (gameObject != null) {
                int gameObjectSceneX = gameObject.getSceneMinLocation().getX();
                int gameObjectSceneY = gameObject.getSceneMinLocation().getY();
                v.invoke("Jump", "<col=ffff>Gap", 15610, 3, gameObjectSceneX, gameObjectSceneY, false);
            }
            //Not sure what to do for above ^^^
        } else if (v.getWalking().nearEntity(Entity.GAME, 15611, 10) && v.getWalking().nearY(3314, 1)) {
            GameObject gameObject = v.getGameObject().findNearest(15611);
            if (gameObject != null) {
                int gameObjectSceneX = gameObject.getSceneMinLocation().getX();
                int gameObjectSceneY = gameObject.getSceneMinLocation().getY();
                v.invoke("Jump", "<col=ffff>Gap", 15611, 3, gameObjectSceneX, gameObjectSceneY, false);
            }
        } else if (v.getWalking().nearEntity(Entity.GAME, 28912, 10) && v.getWalking().nearY(3309, 1)) {
            GameObject gameObject = v.getGameObject().findNearest(28912);
            if (gameObject != null) {
                int gameObjectSceneX = gameObject.getSceneMinLocation().getX();
                int gameObjectSceneY = gameObject.getSceneMinLocation().getY();
                v.invoke("Balance-across", "<col=ffff>Steep roof", 28912, 3, gameObjectSceneX, gameObjectSceneY, false);
            }
        } else if (v.getWalking().nearEntity(Entity.GAME, 15612, 1) && v.getWalking().nearY(3297, 1)) {
            GameObject gameObject = v.getGameObject().findNearest(15612);
            if (gameObject != null) {
                int gameObjectSceneX = gameObject.getSceneMinLocation().getX();
                int gameObjectSceneY = gameObject.getSceneMinLocation().getY();
                v.invoke("Jump", "<col=ffff>Gap", 15612, 3, gameObjectSceneX, gameObjectSceneY, false);
            }
        }
    }